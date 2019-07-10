package tests.homepage;

import org.testng.annotations.Test;
import framework.core.BaseTest;
import pageobjects.homepage.GoogleHomepage;

public class GoogleHomePageTests extends BaseTest {

    @Test
    public void homepageTests() {
        GoogleHomepage googleHomepage = new GoogleHomepage(getDriver());
    }
}
