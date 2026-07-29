package modulo12.ExemploFinanceiro01.entities;

public class Conta {

    private String nomeConta;
    private Double valorConta;


    public Conta() {        
    }


    public Conta(String nomeConta, Double valorConta) {
        this.nomeConta = nomeConta;
        this.valorConta = valorConta;
    }


    public String getNomeConta() {
        return nomeConta;
    }


    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }


    public Double getValorConta() {
        return valorConta;
    }


    public void setValorConta(Double valorConta) {
        this.valorConta = valorConta;
    }


    

    
    
}
