package chapter5.second.Q7;

import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Urumqi")));

        System.out.println(Period.of(0, 20, 47));
    }
}
