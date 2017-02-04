package chapter5.second.Q13;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
        Duration d = Duration.ofHours(1);
        ZonedDateTime dateTime2 = dateTime1.plus(d);

        System.out.println(ChronoUnit.HOURS.between(dateTime1, dateTime2));
        System.out.println(dateTime1.getHour());
        System.out.println(dateTime2.getHour());
        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}
