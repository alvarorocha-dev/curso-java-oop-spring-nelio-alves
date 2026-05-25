package modulo09.exercicioRPG01.entities;

public class Character {    

    //Private Fields
    private String characterName;
    private char characterSex;
    private String characterClass;  
    private int str;
    private int dex;
    private int wis;
    private int cha;
    private String characterSkills;
    private String characterRace;
    private double movement;
    private String inventory;
    private double gold;
    

    //Character Constructor
    public Character (String characterName, char characterSex, int classResponse, int str, int dex, int wis, int cha, int raceResponse, String characterSkills) {
        this.characterName = characterName;
        this.characterSex = characterSex;       
        this.str = str;
        this.dex = dex;
        this.wis = wis;
        this.cha = cha;
        this.characterSkills = characterSkills;
        chooseRace(raceResponse);
        chooseClass(classResponse);
    }      
    
    //Choose Race and Bônus
    private void chooseRace(int raceResponse) {  
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
                movement =  dex * 1.0;
                break;
            case 4:
                characterRace = "Hobbit";
                str -= 1;
                cha += 1;
                movement =  dex * 1.0;
                break;        
            default:
                characterRace = "Goblin";
                 movement =  dex * 0.75;
                break;
        }
    }

    //Choose Class, Inventory and Gold
    private void chooseClass (int classResponse) {
        switch (classResponse) {
            case 1:
                characterClass = "Warrior";
                inventory = "Sword, Shield, Heavy Armor";
                gold = cha * 1.5;                
                break;
            case 2:
                characterClass = "Mage";
                inventory = "Magical Staff, Grimoire, Robe";
                gold = cha * 2.5;
                break;
            case 3:
                characterClass = "Cleric";
                inventory = "Mace, Shield, Sacred Medallion";
                gold = cha * 1;
                break;
            case 4:
                characterClass = "Thief";
                inventory = "Cloak, Dagger, Poison";
                gold = cha * 2.0;
                break;        
            default:
                characterClass = "Peasant";
                inventory = "Bread, Water, Axe";
                gold = cha;
                break;
        }
    }

    //To String Character Sheet
    public String toString() {
        return
        "Name: " + characterName + "\n" +
        "Sex: " + characterSex + "\n" +
        "Class: " + characterClass + "\n" +
        "Attributes: Strength " + str + " | Dexterity " + dex + " | Wisdom " + wis + " | Charisma " + cha + "\n" + 
        "Race: " + characterRace + "\n" +
        "Movement: " + String.format("%.1f", movement) + "\n" +
        "Perícias: " + characterSkills + "\n" +
        "Inventário: " + inventory + "\n" +
        "Gold: " + String.format("%.2f", gold)
        ;
    }
}
