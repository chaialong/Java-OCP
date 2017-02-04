package chapter5.second.Q16;

import java.time.*;

public class Demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        long epochSeconds = 0;

        Instant instant1 = Instant.now();
        Instant instant2 = Instant.ofEpochSecond(epochSeconds);
        Instant instant3 = zonedDateTime.toInstant();

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
    }
}
