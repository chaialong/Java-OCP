package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOwnerDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\temp\\test.txt");
        try {
            System.out.println(Files.getOwner(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
