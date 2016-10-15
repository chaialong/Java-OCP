package chapter9;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class FileOwnershipDemo {
    public static void main(String[] args) {
//        getOwner1();
        getOwner2();
    }

    private static void getOwner2(){
        Path path = Paths.get("C:\\temp\\test.txt");
        try {
            System.out.println(Files.getOwner(path).getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getOwner1() {
        try {
            UserPrincipal principal = FileSystems.getDefault().getUserPrincipalLookupService()
                    .lookupPrincipalByName("chaialong");
            System.out.println(principal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
