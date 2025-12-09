package activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");
            boolean fStatus = file.createNewFile();
            System.out.println("File created: " + fStatus);

            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a sample text.");
            writer.close();

            String data = FileUtils.readFileToString(file, "UTF-8");
            System.out.println("Data in file: " + data);

            File destDir = new File("destDir");
            if (!destDir.exists()) {
                destDir.mkdir();
            }

            FileUtils.copyFileToDirectory(file, destDir);

            File newFile = FileUtils.getFile(destDir, "sample.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF-8");
            System.out.println("Data in copied file: " + newFileData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
