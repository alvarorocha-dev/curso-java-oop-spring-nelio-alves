package triangulos02.entities; //pacote da classe

public class Triangle { 
    //cria uma classe (entitie) "Triangle" pública com 3 atributos, cada um dos lados de um triângulo
    
    public double a; //o "public" indica que o atributo ou método podem ser usado em outros arquivos
    public double b;
    public double c;

    //Cria a função "area" para calcular a área do triângulo
    public double area() { //não receber parametros entre parenteses por usar "a", "b" e "c" declarados anteriormente
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p -b) * (p - c));
    
    /* Cria uma variável para armazenar o resultado e depois retorna o valor dessa variável 
    double result = Math.sqrt(p * (p - a) * (p -b) * (p - c));
    return result;
    */

    }
}