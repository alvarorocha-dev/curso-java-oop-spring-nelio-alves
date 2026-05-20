package modulo09.exercicioEstoque02.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    //Declaração do construtor
    public Product(String name, double price, int quantity) {
        this.name = name;  //o this referencia o "name" fora do construtor, o atributo do objeto declarado acima. O name depois do sinal de "=" é o parâmetro do método entre parênteses. O valor armazenado na variável que virá na instância do programa. Esse valor será atribuído ao atributo do objeto
        this.price = price;
        this.quantity = quantity;
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
