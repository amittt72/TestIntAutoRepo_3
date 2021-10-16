package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By userNameTextBox = By.id("username");
    private By passwordTextBox = By.id("password");
    private By loginButton = By.id("login");
    private By loginErrorMessage = By.id("loginErrorMessage");

    public void setUserName(String userName){
        driver.findElement(userNameTextBox).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void login(String userName, String password){
        setUserName(userName);
        setPassword(password);
        clickLogin();
    }

    public String getLoginErrorMessage(){
        return driver.findElement(loginErrorMessage).getText();
    }
}
