package modulo12.ExemploRPG01.entities.enums;

public enum Level {
    NOVICE("Iniciante"),
    ADEPT("Adepto"),
    MASTER("Mestre"),
    EPIC("Epico");

    private final String descricao;

    Level(String descricao) {
        this.descricao = descricao;
    }

    //Metodo que captura e retorna a descrição 
    public String getDescricao() {
        return descricao;
    }
}
