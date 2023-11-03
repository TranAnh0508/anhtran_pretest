package Downloader.Page;

import Downloader.Common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends GeneralPage{
    //Locators
    private final By txtWelcomeLoc = By.xpath("//h1[contains(text(),'Welcome to the-internet')]");
    private final By btnFileDownloaderPageLoc = By.xpath("//a[@href='/download']");

    //Elements
    public WebElement txtHomePageTitle() {
        return Driver.driver.findElement(txtWelcomeLoc);
    }

    public WebElement btnFileDowloaderPage () { return Driver.driver.findElement(btnFileDownloaderPageLoc); }

    //Methods
    public String getHomePageTitle() {
        return txtHomePageTitle().getText();
    }
    public void goToFileDownloaderPage() {
        btnFileDowloaderPage().click();
    }
}
