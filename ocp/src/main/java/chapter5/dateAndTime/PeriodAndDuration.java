package chapter5.dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodAndDuration {
    public static void main(String[] args) {
        Period a = Period.ofDays(1);
        Duration d = Duration.ofDays(1);

        LocalDate date = LocalDate.now();
        System.out.println(date.plus(a));
        System.out.println(date.plus(d));

    }
}
