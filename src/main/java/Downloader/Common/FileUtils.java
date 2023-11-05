package Downloader.Common;

import Downloader.Constant.Constant;
import Downloader.Page.FileDownloaderPage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class FileUtils {
    private FileDownloaderPage fileLocal = new FileDownloaderPage();
    WebDriverWait wait = new WebDriverWait(Driver.driver, Constant.TIMES_OUT_SECONDS);

    public File getDownloadedFile(String fileName) {
        File file = new File("C:\\Users\\OS\\Downloads\\" + fileName);
        return file;
    }

    public boolean isFileExist(File file) {
        if(file.exists() && !file.isDirectory()) {
            return true;
        }
        return false;
    }

    public void delFile(File file) {
        file.delete();
    }

    public File changFileIfExisted(File file, int index) {
        if (isFileExist(file) == true) {
            System.out.println("File:" + file + " is exist!");
            int newIndex = fileLocal.getRandomIndex(fileLocal.getSizeLinkDownloadable());
            System.out.println(newIndex);
            fileLocal.clickOnRandomLink(newIndex);
            return getDownloadedFile(fileLocal.getLinkDownloadableName(newIndex));
        } {
            fileLocal.clickOnRandomLink(index);
            System.out.println(index);
            return file;
        }
    }

    public void waitFile(File file) {
//         wait.until(isFileExist(file));
    }
}
