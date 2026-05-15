public class FuncoesStrings01 {
    public static void main(String[] args) {        

        String original = "abcde FGHIJ ABC abc DEFG   ";
        System.out.println("String Original: -" + original + "-");

        String s01 = original.toLowerCase();
        System.out.println("Lowercase: -" + s01 + "-");

        String s02 = original.toUpperCase();
        System.out.println("Uppercase: -" + s02 + "-");

        String s03 = original.trim(); //elimina os espaços no início e no final da String
        System.out.println("Trim: -" + s03 + "-");

        String s04 = original.substring(2); //gera uma nova string a partir do indice "2" da string original
        System.out.println("Substring(2): -" + s04 + "-");

        String s05 = original.substring(2,9); //gera uma nova string a partir do indice "2" até o indice "9"  da string original
        System.out.println("Substring(2,9): -" + s05 + "-");

        String s06 = original.replace('a', 'x'); //substitui o "a" por "x" em toda a String
        System.out.println("Replace('a', 'x'): -" + s06 + "-");

        String s07 = original.replace("abc", "xy"); //realiza a troca do consjunto de caracteres
        System.out.println("Replace('abc', 'xy'): -" + s07 + "-");

        int i = original.indexOf("bc"); //aponta o indice da primeira ocorrencia do primeiro caractere entre parenteses
        System.out.println("indexOf('bc'): -" + i + "-");

        int j = original.lastIndexOf("bc"); //aponta o indice da ultima ocorrencia do primeiro caractere entre parenteses
        System.out.println("lastIndexOf('bc'): -" + j + "-");

        String fruitBasket = "Lemon Apple Grape"; //String original

        String[] fruit = fruitBasket.split(" "); //separa os itens detectando o caractere de espaço (" ") entre eles e armazena em um vetor (fruit)

        for (int z = 0; z < fruit.length; z++) { //for para mostrar os itens dentro do vetor
            System.out.print(fruit[z] + " ");
        }
    }
}