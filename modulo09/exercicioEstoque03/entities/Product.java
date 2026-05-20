package modulo09.exercicioEstoque03.entities;

public class Product {
    
    private String name; //os atributos foram declarados como "private"
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }    
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Método para alterar o atributo nome do objeto    
    public void setName(String name) { //void por nao retornar nenhum valor. Altera o valor direto no atributo
        this.name = name; //o atributo name do objeto (this.name) receberá o valor armazenado no parâmetro "name".
    }

    //Método para obter o atributo nome do objeto 
    public String getName() {
        return name;
    }

     //Método para alterar o atributo valor do objeto 
    public void setPrice(double price) {
        this.price = price;
    }

     //Método para obter o atributo valor do objeto 
    public double getPrice() {
        return price;
    }

    //O quantity permitirá apenas consulta. A quantidade poderá se alterada apenas quando tiver entrada ou saída de produtos usando os métodos no programa principal
    public int getQuantity() {
        return quantity;
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
