package chapter5.localization;

import java.util.Locale;

public class LocalizationDemo {
    public static void main(String[] args) {
        System.out.println(Locale.ENGLISH);
        Locale l = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(l);
    }
}
