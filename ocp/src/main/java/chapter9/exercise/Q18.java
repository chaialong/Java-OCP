package chapter9.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q18 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/temp/./").resolve(Paths.get("test.txt"));
        Path path2 = new File("/temp/././actions/../test.txt").toPath();

        System.out.println(Files.isSameFile(path1, path2));
        System.out.println(path1.equals(path2));
        System.out.println(path1.normalize().equals(path2.normalize()));
    }
}
