package modulo11.CalculoDataHora01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
       // DateTimeFormatter fmt02 = DateTimeFormatter.ISO_INSTANT;

    

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        LocalDate next5YearsLocalDate = d01.plusYears(5);

        System.out.println("d01: " + d01);
        System.out.println("d01 pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("d01 nextWeekLocalDate: " + nextWeekLocalDate);
        System.out.println("d01 next5YearsLocalDate: " + next5YearsLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        LocalDateTime next5YearsLocalDateTime = d02.plusYears(5);
        LocalDateTime next3HoursLocalDateTime = d02.plusHours(3);

        System.out.println("<---------------------------------->");
        System.out.println("d02: " + d02.format(fmt01));
        System.out.println("d02 pastWeekLocalDateTime: " + pastWeekLocalDateTime.format(fmt01));
        System.out.println("d02 nextWeekLocalDateTime: " + nextWeekLocalDateTime.format(fmt01));
        System.out.println("d02 next5YearsLocalDateTime: " + next5YearsLocalDateTime.format(fmt01));
        System.out.println("d02 next3HoursLocalDateTime: " + next3HoursLocalDateTime.format(fmt01));

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("<---------------------------------->");
        System.out.println("d03: " + d03);
        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);
        


    }
}
