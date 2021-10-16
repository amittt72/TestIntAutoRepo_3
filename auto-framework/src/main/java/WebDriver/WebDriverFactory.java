package WebDriver;

public class WebDriverFactory {
    public WebDriverManager getWebDriver(String browserType){
        if (browserType.equals(BrowserType.CHROME.toString()))
            return new ChromeDriverManager();
        else
            return new FirefoxDriverManager();
    }
}
