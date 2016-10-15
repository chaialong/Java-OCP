package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileAttributeViewDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/temp/test.txt");

        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes data = view.readAttributes();
        FileTime lastModifyTime = FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
        view.setTimes(lastModifyTime, null, null);
        System.out.println(lastModifyTime);
    }

}
