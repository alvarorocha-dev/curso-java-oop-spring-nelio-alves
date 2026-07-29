package modulo12.ExemploRPG01.entities;

import java.util.ArrayList;
import java.util.List;

import modulo12.ExemploRPG01.entities.enums.Level;


public class Personagem {
    
    private String name;
    private String classe;
    private Level level;
    private Integer body;
    private Integer mind;
    private Integer magic;

    private List<Weapons> weapons = new ArrayList<>();


    public Personagem() {        
    }


    public Personagem(String name, String classe, Level level, int body, int mind, int magic) {
        this.name = name;
        this.classe = classe;
        this.level = level;
        this.body = body;
        this.mind = mind;
        this.magic = magic;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getClasse() {
        return classe;
    }


    public void setClasse(String classe) {
        this.classe = classe;
    }


    public Level getLevel() {
        return level;
    }


    public void setLevel(Level level) {
        this.level = level;
    }  


    public Integer getBody() {
        return body;
    }


    public void setBody(Integer body) {
        this.body = body;
    }


    public int getMind() {
        return mind;
    }


    public void setMind(int mind) {
        this.mind = mind;
    }


    public int getMagic() {
        return magic;
    }


    public void setMagic(int magic) {
        this.magic = magic;
    }


    public List<Weapons> getWeapons() {
        return weapons;
    }


    public void addWeapon(Weapons weapon) {
        weapons.add(weapon);
    }

    public void removeWeapon(Weapons weapon) {
        weapons.remove(weapon);
    }

    

    




}
