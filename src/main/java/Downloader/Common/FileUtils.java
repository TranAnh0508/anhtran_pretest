package Downloader.Common;

import java.io.File;

public class FileUtils {
    public static boolean isFileExist() {
        File file = new File("C:\\Users\\OS\\Downloads");
        if(file.exists() && !file.isDirectory()) {

        }
        return false;
    }
}
