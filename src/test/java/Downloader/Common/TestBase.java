package Downloader.Common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
    private Driver driver = new Driver();

    @BeforeTest
    public void beforeTest() {
        driver.open();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
