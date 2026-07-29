package modulo12.ExemploEstoque01.entities;

public class Entrada {
    private String produto;
    private Double valor;
    private Integer quant;

    public Entrada() {
    }

    public Entrada(String produto, Double valor, Integer quant) {
        this.produto = produto;
        this.valor = valor;
        this.quant = quant;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public double totalEntrada() {
        return valor * quant;
    }
    
    
}
