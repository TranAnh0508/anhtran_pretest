package Downloader.Page;

import Downloader.Common.Driver;
import Downloader.Common.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileDownloaderPage extends GeneralPage{
    //Locators
    private final By txtFileDownloaderPageTitleLoc = By.xpath("//h3[contains(text(),'File Downloader')]");
    private final By linkDownloadableLoc = By.xpath("//a[contains(@href,'download/')]");

    //Elements
    public WebElement txtFileDownloaderPageTitle() {
        return Driver.driver.findElement(txtFileDownloaderPageTitleLoc);
    }
    public WebElement linkDownloadable() {
        return (WebElement) Driver.driver.findElements(linkDownloadableLoc);
    }

    //Methods
    public String getFileDownloaderPageTitle () {
        return txtFileDownloaderPageTitle().getText();
    }
    public int getSizeLinkDownloadable () {
        int linkCount = Driver.driver.findElements(linkDownloadableLoc).size();
        return linkCount;
    }
    public void clickOnRandomLink () {

    }
}
