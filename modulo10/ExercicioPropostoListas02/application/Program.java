package modulo10.ExercicioPropostoListas02.application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import modulo10.ExercicioPropostoListas02.entities.Employee;

public class Program {
    public static void main(String[] args) {        
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner (System.in);

        System.out.print("How many employess will be registered? ");
        int N = sc.nextInt();

        List <Employee> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            //chama a função auxiliar que verifica IDs iguais (a função esta no final)
            while(hasId(list, id)) {
                System.out.println("ID already taken. Try again: ");
                id = sc.nextInt();
            }
            
            System.out.print("Name: ");
            sc.nextLine(); //limpa o buffer de preenchimento apos o nxetInt
            String name = sc.nextLine();
            System.out.print("Salary US$: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase: ");
        int idSalary = sc.nextInt();
        
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("ID not found.");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of Employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    //Função auxiliar que percorre a Lista e verifica se ja tem um Id igual cadastrado
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }    
}
