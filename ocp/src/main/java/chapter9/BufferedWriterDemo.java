package chapter9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\temp\\test.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))) {
            writer.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
