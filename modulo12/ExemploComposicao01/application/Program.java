package modulo12.ExemploComposicao01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import modulo12.ExemploComposicao01.entities.Department;
import modulo12.ExemploComposicao01.entities.HourContract;
import modulo12.ExemploComposicao01.entities.Worker;
import modulo12.ExemploComposicao01.entities.enums.WorkerLevel;



public class Program {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Department's name: ");
        String departmentName =sc.nextLine();
        System.out.println("\n <----- Enter worker data ---->\n");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("\n <----- Enter worker contracts ---->\n");

        System.out.print("How many contracts will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter data of contract #" + i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next()); 
            //captura a data usando o "sc.next" e formata com a máscara "sdf" criada acima
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

            worker.addContract(contract); //adiciona o contrato à lista (Array) do trabalhador
        }

        System.out.print("\n <----- Enter worker search ---->\n");

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        //captura os dois primeiros digitos da variavel "monthAndYear" e converte para inteiro
        int year = Integer.parseInt(monthAndYear.substring(3));
        //captura os digitos a partir da posição 3 da variavel "monthAndYear" e converte para inteiro

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        //captura o "name" dentro do "getDepartment()" na classe "Worker"
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
    
}
