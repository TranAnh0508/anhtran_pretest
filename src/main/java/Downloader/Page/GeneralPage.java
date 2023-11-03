package Downloader.Page;

import Downloader.Common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GeneralPage {

    //Locators

    //Elements

    //Methods
    public void scrollscreen(WebElement webElement) {
        Actions action = new Actions(Driver.driver);
        action.moveToElement(webElement).click().build().perform();
    }

}
