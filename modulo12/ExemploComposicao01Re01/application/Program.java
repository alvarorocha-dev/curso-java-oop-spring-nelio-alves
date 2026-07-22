package modulo12.ExemploComposicao01Re01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modulo12.ExemploComposicao01Re01.entities.HourContract;
import modulo12.ExemploComposicao01Re01.entities.Department;
import modulo12.ExemploComposicao01Re01.entities.Worker;
import modulo12.ExemploComposicao01Re01.entities.enums.WorkerLevel;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("<------ Enter Worker data: ------>");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("\nHow many contracts to this worker? ");

        int n =sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "º Contract date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print(i + "º Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print(i + "º Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours); //instancia um novo contrato com os dado fornecidos
            worker.addContract(contract);//adiciona o contrato à lista de contratos do trabalhador
        }

        System.out.println("\n <---------------> \n");
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        //obtem o mes capturando os dois primeiros digitos e convertendo para "int"
        int year = Integer.parseInt(monthAndYear.substring(3));
        //obtem o ano capturando os digitos a partir da posição 3 e convertendo para "int"

        System.out.println("\n <---------------> \n");
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
