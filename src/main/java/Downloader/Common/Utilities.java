package Downloader.Common;

import Downloader.Constant.Constant;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Utilities {
    public void scrollscreen(WebElement webElement) {
        Actions action = new Actions(Driver.driver);
        action.moveToElement(webElement).click().build().perform();
    }

    public void waitToFile(String filePath) {
        WebDriverWait wait = new WebDriverWait(Driver.driver, Constant.TIMES_OUT_SECONDS);

    }
}
