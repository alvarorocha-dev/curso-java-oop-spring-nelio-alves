package circumference03.util;

public class Calculator {
    

    //O "PI" e outros métodos foram definidos como "static" para permitir que sejam utilizados independente do objeto

    public static final double PI = 3.14159; 

    public static double circumference(double radius) { 
        return (2.0 * PI) * radius;
    }

    public static double volume(double radius) {
        return ((4.0 * PI) * Math.pow(radius, 3)) / 3.0;
    }
}
