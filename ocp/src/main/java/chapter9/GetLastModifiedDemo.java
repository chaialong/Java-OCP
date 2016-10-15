package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class GetLastModifiedDemo {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\temp\\test.txt");
            FileTime lastModifiedTime = Files.getLastModifiedTime(path);
            System.out.println(lastModifiedTime);
            Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
            System.out.println(Files.getLastModifiedTime(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
