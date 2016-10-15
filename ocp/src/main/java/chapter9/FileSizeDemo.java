package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSizeDemo {
    public static void main(String[] args) {
        try {
            System.out.println(Files.size(Paths.get("C:\\temp\\test.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
