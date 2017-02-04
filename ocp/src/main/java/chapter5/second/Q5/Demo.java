package chapter5.second.Q5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));

        ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
        System.out.println(b.getString("name"));
        System.out.println(b.getString("age"));
    }
}
