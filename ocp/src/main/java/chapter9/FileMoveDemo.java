package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMoveDemo {
    public static void main(String[] args) {
        try {
            Files.move(Paths.get("C:\\temp\\test.txt"), Paths.get("C:\\temp\\test-save.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
