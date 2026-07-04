package modulo11.DuracaoDataHora01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Program {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-23T01:30:26");
        LocalDateTime dataNascimento = LocalDateTime.parse("1981-12-13T00:01:00");
        LocalDateTime hoje = LocalDateTime.now();

        Duration duracao01 = Duration.between(d01.atTime(0,0), d02);
        //O d01 é um "LocalDate" e não possui informações de horas. O ".atTime(0,0)" ou ".atStartOfDay()" adiciona "0 horas e 0 minutos" permitindo que o calculo seja realizado
        System.out.println("Duracao 01: " + duracao01);
        System.out.println("Duracao 01 em dias: " + duracao01.toDays());       

        Duration idade = Duration.between(dataNascimento, hoje);        
        System.out.println("Dias: " + idade.toDays());
    }
}