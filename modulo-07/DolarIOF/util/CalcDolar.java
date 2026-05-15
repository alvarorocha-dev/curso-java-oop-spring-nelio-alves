package DolarIOF.util;

public class CalcDolar {
    
    public static final double IOF = 6; //constatnte com o valor do IOF

    public static double dollarPrice; //recebe a cotação do dolar  

    public static double CurrencyConverter(double dollarBuy) { //recebe a quantidade de dolares comprados
        return (dollarBuy * dollarPrice); //converte para reais
    }

    public static double CalcIOF (double valorReal) { //recebe o total em reais convertido
        return valorReal += (valorReal * IOF) / 100; //calcula e acrescenta o valor do IOF ao total a ser pago
    }
}
