package chapter9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) throws IOException {
        pathDemo2();
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        System.out.println(Paths.get(".").toRealPath());
    }

    private static void pathDemo2(){
        Path path3 = Paths.get("E:\\data");
        Path path4 = Paths.get("E:\\user\\home");
        Path relativePath = path3.relativize(path4);
        System.out.println(path3.resolve(relativePath).normalize());
    }

    private static void pathDemo1() {
        Path path = Paths.get("C:\\temp\\test.csv");
        System.out.println(path);

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));
        }

        Path path1 = Paths.get("C:\\birds\\egret.txt");
        System.out.println("Path1 is Absolute? "+path1.isAbsolute());
        System.out.println("Absolute Path1: "+path1.toAbsolutePath());
        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? "+path2.isAbsolute());
        System.out.println("Absolute Path2 "+path2.toAbsolutePath());

        System.out.println(Paths.get("/stripes/zebra.exe").isAbsolute());
        System.out.println(Paths.get("c:/goats/Food.java").isAbsolute());
    }
}
