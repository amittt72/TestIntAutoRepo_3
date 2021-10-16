package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager implements WebDriverManager {

    @Override
    public WebDriver getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        return new ChromeDriver(options);
    }
}
