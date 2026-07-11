package modulo12.Enumeracoes02.application;

import java.util.Date;
import modulo12.Enumeracoes01.entities.Order;
import modulo12.Enumeracoes01.entities.OrderStatus;


public class Program {
    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        //Conversão String para Enum
        System.out.println(os1);
        System.out.println(os2);
    }
}
