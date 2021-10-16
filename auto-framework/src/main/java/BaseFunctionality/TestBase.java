package BaseFunctionality;

import org.openqa.selenium.WebDriver;
import WebDriver.*;

public class TestBase {
    private static WebDriver driver;

    public WebDriver setUp(String browserType, String url){
        getDriver(browserType);
        driver.get(url);
        return driver;
    }

    public WebDriver getDriver(String browserType){
        if (driver == null) {
            WebDriverFactory webDriverFactory = new WebDriverFactory();
            WebDriverManager webDriverManager = webDriverFactory.getWebDriver(browserType);
            driver = webDriverManager.getDriver();
        }
        return driver;
    }

    public void quitDriver(){
        if (driver != null)
            driver.quit();
    }
}