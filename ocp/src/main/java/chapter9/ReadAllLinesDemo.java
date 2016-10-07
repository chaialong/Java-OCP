package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLinesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\temp\\test.txt");

        try {
            List<String> strings = Files.readAllLines(path);

            strings.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
