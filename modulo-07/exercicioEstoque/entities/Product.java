package exercicioEstoque.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) { //o "quantity" do parâmetro será obtido no programa principal
        this.quantity += quantity; //o "this" determina que o "quantity" utilizado é o atributo da classe "Product"
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() { //sobrepõe o "toString" padrão para o formato definido abaixo
    return name 
            + " - US$ " 
            + String.format("%.2f", price) //formata o valor do "price" para 2 casas decimais
            + " - " 
            + quantity 
            + " units - Total: US$ " 
            + String.format("%.2f", totalValueInStock()); //formata o valor retornado no "totalValueInStock" para 2 casas decimais
    }
}
