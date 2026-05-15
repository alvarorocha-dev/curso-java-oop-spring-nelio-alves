package circumference02.util;

public class Calculator {
    
    public final double PI = 3.14159; //o "final" na declaração determina que o valor armazenado é uma constante e não pode ser alterado. Nomes de Constantes são escritos com maiúsculas e usam "_" para separar as palavras.

    //SALARIO_LIQUIDO, IMPOSTO_DE_RENDA, etc

    public double circumference(double radius) { 
        return (2 * PI) * radius;
    }

    public double volume(double radius) {
        return ((4 * PI) * Math.pow(radius, 3)) / 3;
    }
}
