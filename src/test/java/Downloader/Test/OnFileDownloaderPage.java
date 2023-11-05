package Downloader.Test;

import Downloader.Common.FileUtils;
import Downloader.Common.Log;
import Downloader.Common.TestBase;
import Downloader.Constant.Constant;
import Downloader.Page.FileDownloaderPage;
import Downloader.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class OnFileDownloaderPage extends TestBase {
    private SoftAssert softAssert = new SoftAssert();
    private HomePage homePage = new HomePage();
    private FileDownloaderPage fileDownloaderPage = new FileDownloaderPage();
    private FileUtils fileUtils = new FileUtils();
    private Log log = new Log();
    private int index;
    private File fileLocal;

    @Test (description = "Verify that user is on File Downloader Page")
    public void tc01_VerifyUserCanGotoDownloadPageSuccessfully () throws InterruptedException {
        log.info("1. Go to HEROKUAPP");
        softAssert.assertEquals(homePage.getHomePageTitle(), Constant.HOME_PAGE_TITLE);

        log.info("1. Go to Downloag Page");
        homePage.goToFileDownloaderPage();

        log.info("3. Verify the user is on Download Page");
        softAssert.assertEquals(fileDownloaderPage.getFileDownloaderPageTitle(), Constant.DOWNLOAD_PAGE_TITLE);

        log.info("4. Counts the download links");
        softAssert.assertEquals(fileDownloaderPage.getSizeLinkDownloadable(), Constant.EXPECT_TOTAL);

        //Lấy chỉ số ngẫu nhiên cho list link
        index = fileDownloaderPage.getRandomIndex(fileDownloaderPage.getSizeLinkDownloadable());
        System.out.println("Original Index: " + index);

        //Xác định tên của file được download
        String nameFile = fileDownloaderPage.getLinkDownloadableName(index);
        System.out.println(nameFile);

        //Xác định địa chỉ local của downloaded file
        fileLocal = fileUtils.getDownloadedFile(nameFile);

        //Kiểm tra file có tồn tại ko
        fileUtils.isFileExist(fileLocal);
        softAssert.assertTrue(fileUtils.isFileExist(fileLocal));
        System.out.println("1. File down về còn tồn tại ko: " + fileUtils.isFileExist(fileLocal));

        //Download file chưa tồn tại
        fileLocal = fileUtils.changFileIfExisted(fileLocal, index);

        Thread.sleep(5000);
        System.out.println("2. File down về còn tồn tại ko: " + fileUtils.isFileExist(fileLocal));
        softAssert.assertTrue(fileUtils.isFileExist(fileLocal));

        //Xóa file đã download
        fileUtils.delFile(fileLocal);
        System.out.println("3. File down về còn tồn tại ko: " + fileUtils.isFileExist(fileLocal));
    }
}
