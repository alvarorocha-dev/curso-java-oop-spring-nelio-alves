package modulo09.exercicioRPG01.entities;

public class Character {    

    private String characterName;
    private char characterSex;
    private String characterClass;  
    private int str;
    private int dex;
    private int wis;
    private int cha;
    private int raceResponse;

    public Character (String characterName, char characterSex, String characterClass, int str, int dex, int wis, int cha, int raceResponse) {
        this.characterName = characterName;
        this.characterSex = characterSex;
        this.characterClass = characterClass;
        this.str = str;
        this.dex = dex;
        this.wis = wis;
        this.cha = cha;
        this.raceResponse = raceResponse;
    }

    String characterRace = "";   
    double movement = 0;
    public void chooseRace(int raceResponse) {      

        switch (raceResponse) {
            case 1:
                characterRace = "Human";
                movement =  dex * 1.5;               
                break;
            case 2:
                characterRace = "Elf";
                str -= 1;
                dex += 1;
                movement =  dex * 1.5;
                break;
            case 3:
                characterRace = "Dwarf";
                str += 1;
                cha -= 1;
                movement =  dex * 1;
                break;
            case 4:
                characterRace = "Hobbit";
                str -= 1;
                cha += 1;
                movement =  dex * 1;
                break;        
            default:
                characterRace = "Goblin";
                break;
        }

    }

    public String toString() {
        return
        "Name: " + characterName + "\n" +
        "Sex: " + characterSex + "\n" +
        "Class: " + characterClass + "\n" +
        "Attributes: \n" +
        "Strength: " + str + " - Dexterity: " + dex + " - Wisdom: " + wis + " - Charisma: " + cha + "\n" + 
        "Race: " + characterRace + "\n" +
        "Movement: " + movement  
        ;
    }
}
