package framework.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("headless", "false");
        System.setProperty("webdriver.chrome.driver","/Users/igorgrinberg/IdeaProjects/ATF/resources/chromedriver");
        String headless = System.getProperty("headless");

        ChromeDriverManager.chromedriver();
        if("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
    }

    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {

        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
        return driver;
    }
}
