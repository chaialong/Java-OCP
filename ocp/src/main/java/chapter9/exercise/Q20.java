package chapter9.exercise;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q20 {
    public static void main(String[] args) {
        Path path = Paths.get("/seals/harp/food").normalize();
        int count = 0;

        for (int i = 0; i < path.getNameCount(); ++i) {
            count++;
        }

        System.out.println(count);
    }
}
