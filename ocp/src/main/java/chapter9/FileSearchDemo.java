package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class FileSearchDemo {
    public static void main(String[] args) throws IOException {
        SearchDemo2();
    }

    private static void SearchDemo2() throws IOException {
        Path path = Paths.get(System.getProperty("user.dir"));
        Files.find(path, 10, (p, a) -> p.toString().endsWith(".java") &&
                a.creationTime().toMillis() >
                        LocalDateTime.of(2016, Month.OCTOBER, 6, 0, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()).forEach(System.out::println);

    }

    private static void SearchDemo1() throws IOException {
        Path path = Paths.get(System.getProperty("user.dir"));
        long start = System.currentTimeMillis();
        Files.walk(path)
                .filter(x -> x.toString().endsWith(".java"))
                .forEach(System.out::println);
        System.out.println("time consuming: " + (System.currentTimeMillis() - start));
    }
}
