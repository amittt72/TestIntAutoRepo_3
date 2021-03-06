package UI.TestCaseRepo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import BaseFunctionality.TestBase;
import PageObjects.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginFuncTestClass extends TestBase {

    WebDriver driver;
    LoginPage loginPage;

    public LoginFuncTestClass(WebDriver driver) {
        super(driver);
    }

    @BeforeClass
    public void setUp(){
        driver = setUp("CHROME", "https://www.gmail.com");
    }

    @Test
    public void testLogin(){
        loginPage = new LoginPage(driver);
        loginPage.login("admin", "abcd");
        assertEquals(loginPage.getLoginErrorMessage(), "Invalid UserName or Password!");
    }

    @Test
    public void testLoginMethod2(){
        getPOJOParent().getLoginPage().login("admin", "abcd");
        assertEquals(loginPage.getLoginErrorMessage(), "Invalid UserName or Password!");
    }

    @AfterClass
    public void tearDown(){
        quitDriver();
    }
}
