package modulo10.ExercicioMaisVelho02.entities;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return idade;
    }

    public void setAge(int idade) {
        this.idade = idade;
    }    
}