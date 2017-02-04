package chapter5.second.Q14;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("US/Eastern");
        LocalDate date = LocalDate.of(2016, 11, 6);
        LocalTime time = LocalTime.of(2, 15);
        ZonedDateTime a = ZonedDateTime.of(date, time, zone);
        System.out.println(a);
    }
}
