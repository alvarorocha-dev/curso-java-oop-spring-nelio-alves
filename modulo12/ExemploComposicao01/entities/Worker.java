package modulo12.ExemploComposicao01.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import modulo12.ExemploComposicao01.entities.enums.WorkerLevel;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    //Cada trabalhador possui múltiplos contratos. Usa a classe "HourContract" e cria uma lista de "Arrays" com o nome "contracts"

    public Worker() {        
    }

    //O construtor com argumentos deve ser gerado sem "Lista" (Hour contract) por já estar organizado como um "Array"
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    
    // Desabilitar a alteração de contratos. Permitir apenas pelos metodos addContract() e removeContract()
    /* public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts; } */


    //adiciona um novo contrato no array "contracts"
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    //remove o contrato do array "contracts"
    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income (int year, int month) {
        double sum = baseSalary; //declara o total com o salario base como valor inicial
        Calendar cal = Calendar.getInstance();

        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if(year == c_year && month == c_month) { //se o mês E o ano fornecidos forem iguais ao do contrato
                sum += c.totalValue(); //acumula o total se horas à variavel "sum". Utiliza o método "totalValue()" na classe "HourContract"
            }
        }
        return sum; //retorna o valor de "sum" (salario base + total dos contratos)
    }
}
