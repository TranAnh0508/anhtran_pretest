package Downloader.Test;

import Downloader.Common.Driver;
import Downloader.Common.Log;
import Downloader.Common.TestBase;
import Downloader.Constant.Constant;
import Downloader.Page.FileDownloaderPage;
import Downloader.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnFileDownloaderPage extends TestBase {
    private HomePage homePage = new HomePage();
    private FileDownloaderPage fileDownloaderPage = new FileDownloaderPage();
//    private Driver driver = new Driver();

    @Test (description = "Verify that user is on File Downloader Page")
    public void tc01_VerifyUserCanGotoDownloadPageSuccessfully () {
        Log.info("1. Go to HEROKUAPP");
        Assert.assertEquals(homePage.getHomePageTitle(), Constant.HOME_PAGE_TITLE);

        Log.info("1. Go to Downloag Page");
        homePage.goToFileDownloaderPage();

        Log.info("3. Verify the user is on Download Page");
        Assert.assertEquals(fileDownloaderPage.getFileDownloaderPageTitle(), Constant.DOWNLOAD_PAGE_TITLE);

        Log.info("4. Counts the download links");
        Assert.assertEquals(fileDownloaderPage.getSizeLinkDownloadable(), Constant.EXPECT_TOTAL);


    }
}
