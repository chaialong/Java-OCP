package chapter9.exercise;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q1 {
    public static void main(String[] args) {
        Path path = Paths.get("/user/.././root", "../kodiacbear.txt");
        System.out.println(path.normalize());
        path.normalize().relativize(Paths.get("/lion"));
        System.out.println(path);

        path = Paths.get("C:\\temp");
        System.out.println(path.resolve("test.txt"));
    }
}
