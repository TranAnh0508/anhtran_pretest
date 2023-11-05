package Downloader.Common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Downloader.Constant.Constant;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Utilities {
    private FileUtils fileUtils = new FileUtils();

    public void scrollscreen(WebElement webElement) {
        Actions action = new Actions(Driver.driver);
        action.moveToElement(webElement).click().build().perform();
    }

    public void waitForFile(File file) {
        while (fileUtils.isFileExist(file)==false) {
        }
    }
}
