package modulo10.ExerciciosAprovados02.entities;

public class Aluno {

    private String nome;
    private double nota01;
    private double nota02;

    public Aluno (String nome, double nota01, double nota02) {
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }

    public String getName() {
        return nome;
    }

    public double getNota01() {
        return nota01;
    }
    public double getNota02() {
        return nota02;
    }    
}
