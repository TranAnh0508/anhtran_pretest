package Downloader.Page;

import Downloader.Common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class FileDownloaderPage extends GeneralPage{
    //Locators
    private final By txtFileDownloaderPageTitleLoc = By.xpath("//h3[contains(text(),'File Downloader')]");
    private final By linkDownloadableLoc = By.xpath("//div[@id='content']//a[contains(@href,'download/')]");

    //Elements
    public WebElement txtFileDownloaderPageTitle() {
        return Driver.driver.findElement(txtFileDownloaderPageTitleLoc);
    }
    public List<WebElement> linkDownloadable() {
        return Driver.driver.findElements(linkDownloadableLoc);
    }

    //Methods
    public String getFileDownloaderPageTitle() {
        return txtFileDownloaderPageTitle().getText();
    }

    public int getSizeLinkDownloadable() {
        int linkCount = Driver.driver.findElements(linkDownloadableLoc).size();
        return linkCount;
    }

    public int getRandomIndex(){
        Random r = new Random();
        int randomValue = r.nextInt(getSizeLinkDownloadable());
        return randomValue;
    }

    /**
     * Click on an any link on the LinkDownloadAble page
      * @param randomValue
     */
    public void clickOnRandomLink(int randomValue) {
        List<WebElement> listings = linkDownloadable();
        listings.get(randomValue).click();
    }

    /**
     * get the name of the link
     * @param randomValue
     * @return name of the link
     */
    public String getLinkDownloadableName(int randomValue) {
        List<WebElement> listings = linkDownloadable();
        return listings.get(randomValue).getText();
    }
}
