package modulo12.ExemploComposicao01Re01.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import modulo12.ExemploComposicao01Re01.entities.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); //cria uma lista chamada "contracts" para armezenar os contratos com base na classe "HourContract"
    
    public Worker() {        
    }

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

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }
    
    public Double income(int year, int month) { //captura o mes e ano digitados na pesquisa
        double sum = baseSalary; //acumulador do total iniciando com o valor do "baseSalary"
        Calendar cal =Calendar.getInstance(); //inicia um calendario
        for (HourContract c: contracts) { //para cada "HourContract" "c" na lista "contracts"
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR); //captura o ano do contrato
            int c_month = 1 + cal.get(Calendar.MONTH); //captura o mes do contrato
            if(year == c_year && month == c_month) { //se o mes e o ano digitados na pesquisa forem iguais aos do contrato
                sum += c.totalValue(); //acumula o valor do contrato (totalValue) na soma
            }
        }
        return sum; //retorna o total da soma o dinal da função
    }
}