package modulo09.exercicioEstoque02sobre.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

     //Também é possivel usar o construtor padrão
        //public Product() {}

    //Declaração do construtor original
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    //declaração do construtor sobrecarregado, sem a obrigatoriedade de informar a quantidade na criação do objeto
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        //this.quantity = 0; esse valor é opcional. Quando um atributo não tem valor atribuído o java coloca "0" ou "null" automaticamente
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
        + " - US$ "
        + String.format("%.2f", price)
        + " - "
        + quantity
        + " units - Total: US$ "
        + String.format("%.2f", totalValueInStock())
        ;
    }
}
