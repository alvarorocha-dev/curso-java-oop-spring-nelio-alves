package modulo12.ExemploComposicao03.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modulo12.ExemploComposicao03.entities.Client;
import modulo12.ExemploComposicao03.entities.Order;
import modulo12.ExemploComposicao03.entities.OrderItem;
import modulo12.ExemploComposicao03.entities.Product;
import modulo12.ExemploComposicao03.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter client data:");
       System.out.print("Name: ");
       String name = sc.nextLine();
       System.out.print("Email: ");
       String email = sc.next();
       System.out.print("Birth date (DD/MM/YYYY): ");
       Date birthDate = sdf.parse(sc.next());

       Client client = new Client(name, email, birthDate);

       System.out.println("\n ---- Enter order data: ----\n");
       System.out.print("Status: ");
       OrderStatus status = OrderStatus.valueOf(sc.next());

       Order order = new Order(new Date(), status, client);

       System.out.print("How many items to this order? ");
       int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
        System.out.print("#"+ i + " Product name: ");
        sc.nextLine();
        String productName = sc.nextLine();
        System.out.print("#"+ i + " Product price: ");
        double productPrice = sc.nextDouble();
        System.out.print("#"+ i + " Product quantity: ");
        int productQuantity = sc.nextInt();

        Product product = new Product(productName, productPrice);
        OrderItem it = new OrderItem(productQuantity, productPrice, product);

        order.addItem(it);
       }

       System.out.println();
       System.out.println(order);

        sc.close();
    }
}
