package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileContents {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\temp\\test.txt");
        Files.lines(path).forEach(System.out::println);

    }
}
