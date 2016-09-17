package chapter5.localization;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ZooOpen {
    public static void main(String[] args) {
//        localizationTest1();
        localizationTest2();
    }

    private static void localizationTest2(){
        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        rb.keySet().stream()
                .map(x -> x + ":" + rb.getString(x))
                .forEach(System.out::println);

        System.out.println(MessageFormat.format("Hello {0}", "world"));
    }

    private static void localizationTest1() {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperty(us);
        System.out.println();
        printProperty(france);
    }

    private static void printProperty(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }
}
