package Downloader.Common;

import Downloader.Constant.Constant;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class TestBase {
    private Driver driver = new Driver();
    @BeforeTest
    public void beforeTest() {
        driver.open();
    }

    @AfterMethod
    public void afterMethod() {
//        driver.close();
    }
}
