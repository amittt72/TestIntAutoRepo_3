package BaseFunctionality;

import PageObjects.LoginPage;
import PageObjects.SomeOtherPage_1;
import PageObjects.SomeOtherPage_2;
import org.openqa.selenium.WebDriver;

public class POJOParentWeb implements POJOParent{
    WebDriver driver;
    public POJOParentWeb(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public LoginPage getLoginPage() {
        return new LoginPage(driver);
    }

    @Override
    public SomeOtherPage_1 getSomeOtherPage1() {
        return new SomeOtherPage_1();
    }

    @Override
    public SomeOtherPage_2 getSomeOtherPage2() {
        return new SomeOtherPage_2();
    }
}
