package test.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class WebDriverUtils {

    private static WebDriver driver;

    public static WebDriver getNewChromeDriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/natalyakulish/Downloads/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("test-type");

        final DesiredCapabilities chrome = DesiredCapabilities.chrome();
        chrome.setPlatform(Platform.MAC);
        chrome.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        driver = new ChromeDriver(chrome);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getExistingChromeDriver() {
        if (driver != null) {
            return driver;
        }

        driver = getNewChromeDriver();
        return driver;
    }

    public static void closeDriver() {
        if (driver != null)
        {
            driver.close();
            driver = null;
        }
    }

}
