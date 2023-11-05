package Downloader.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utilities {
    public void scrollscreen(WebElement webElement) {
        Actions action = new Actions(Driver.driver);
        action.moveToElement(webElement).click().build().perform();
    }
}
