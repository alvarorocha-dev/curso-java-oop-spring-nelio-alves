package modulo10.ExemploBoxingUnboxing01;

import java.util.Locale;
import java.util.Scanner;

public class ExemploBoxingUnboxing01 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 20;

        Object obj = x; //realiza o boxing ao

        System.out.println(obj);

        int y = (int)obj;

        System.out.println(y);

        Integer inteiro = x;

        int z = inteiro * 2;

        System.out.println(z);

        sc.close();
    }
}
