package tests.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import framework.core.BaseTest;
import pageobjects.homepage.Homepage;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest {


@Test

    public void homepageTests() {
        WebDriver myDriver = getDriver();
        myDriver.findElement(By.xpath(Homepage.register)).click();
        myDriver.findElement(By.name(Homepage.firstName)).sendKeys("Nataly");
        myDriver.findElement(By.name(Homepage.lastName)).sendKeys("Ribakov");
    }
}
