package DolarIOF.application;

import java.util.Locale;
import java.util.Scanner;
import DolarIOF.util.CalcDolar;

public class DolarIOF {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CalcDolar.dollarPrice = sc.nextDouble();  //cotação do dolar

        System.out.print("How many dollars will be bought? ");
        double dollarBuy = sc.nextDouble(); //quantidade de dolares a se comprada

        double valorReal = CalcDolar.CurrencyConverter(dollarBuy); //executa o método "CurrencyConverter" com o parâmetro "dollarBuy" na classe "CalcDolar"
        double totalImposto = CalcDolar.CalcIOF(valorReal); //executa o método "CalcIOF" com o parâmetro "ValorReal" na classe "CalcDolar"

        System.out.printf("Amount in R$: %.2f\n", valorReal);
        System.out.printf("Amount with tax in R$: %.2f\n", totalImposto);
        

        sc.close();
    }
    
}
