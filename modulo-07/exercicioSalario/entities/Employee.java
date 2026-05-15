package exercicioSalario.entities;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() { 
        return grossSalary - tax; //apenas calcula o valor e retorna a reposta, sem alterar a variável
    }

    public void increaseSalary(double percentage) { //o void executa a ação internamente e altera o valor da variável e modifica o objeto "Employee"        
        grossSalary += (grossSalary * percentage) / 100;
    }


    public String toString() {
        return name + ", US$: " + String.format("%.2f", netSalary());
    }
}
