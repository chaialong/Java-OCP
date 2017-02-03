package chapter4.first.interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(s3);
    }
}
