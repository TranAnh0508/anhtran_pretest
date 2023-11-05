package Downloader.Common;

import Downloader.Constant.Constant;
import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;

    public void open() {
        System.setProperty("webdriver.chrome.driver","E:\\Logigear\\Selenium\\TranDinhTruongAnh_8283\\src\\main\\java\\Executables\\chromedriver_v119.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constant.HEROKUAPP_URL);
    }
    public void close() {
        driver.manage().timeouts().implicitlyWait(Constant.TIMES_OUT_SECONDS, TimeUnit.SECONDS);
        driver.quit();
    }
}
