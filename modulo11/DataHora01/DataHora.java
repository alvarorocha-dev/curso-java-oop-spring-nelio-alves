import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    
    public static void main(String[] args) {

        //LocalDate - representa uma hora ou data do dia, sem fuso horarios. Usado para aniversarios e agendamentos
        //Instant - Momento exato e global na linha do tempo (em UTC). Usado para registros técnicos, logs, comunicação de redes, etc.

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
      
         LocalDate d01 = LocalDate.now();
         LocalDateTime d02 = LocalDateTime.now();
         Instant d03 = Instant.now();
         LocalDate d04 = LocalDate.parse("1981-12-13");
         LocalDateTime d05 = LocalDateTime.parse("1981-12-13T13:40:39");
         Instant d06 = Instant.parse("2026-06-25T12:16:02Z");
         Instant d07 = Instant.parse("2026-06-25T12:16:02-03:00");
         LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
         LocalDateTime d09 = LocalDateTime.parse("20/07/2022 15:32", fmt2);
         LocalDateTime d009 = LocalDateTime.parse("20/07/2022 15:32", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
         LocalDate d10 = LocalDate.of(2022, 7, 20);
         LocalDateTime d11 = LocalDateTime.of(2022, 7, 20 ,1 ,30);
         

         System.out.println("Data: " + d01);
         System.out.println("Data e Hora Locais: " + d02);
         System.out.println("Data e Hora com fuso de Londres (GMT): " + d03);
         System.out.println("Data gerada a partir de um texto ISO 8601: " + d04);
         System.out.println("Data e hora geradas a partir de um texto ISO 8601: " + d05);
         System.out.println("Data e hora no formato UTC a partir de um texto: " + d06);
         System.out.println("Data e hora no formato UTC a partir de um texto no horario de Londres: " + d07);
         System.out.println("Data com o Date Time Formatter: " + d08);
         System.out.println("Data com o Date Time Formatter: " + d09);
         System.out.println("Data com o Date Time Formatter InLine: " + d009);
         System.out.println("Data com o Date Time Formatter InLine: " + d10);
         System.out.println("Data com o Date Time Formatter InLine: " + d11);
       
    }
}
