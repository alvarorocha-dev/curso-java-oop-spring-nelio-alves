package modulo09.exercicioRPG01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo09.exercicioRPG01.entities.Character;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        

        System.out.print("Insert the Character name: ");
        String characterName = sc.nextLine();
        

        System.out.print("Insert the Character sex (f/m): ");
        char characterSex = sc.next().charAt(0);

        String characterClass = "";
        System.out.print("Choose the character class: (1) Warrior | (2) Mage | (3) Cleric | (4) - Thief: - ");
        
        int classResponse = sc.nextInt();

        switch (classResponse) {
            case 1:
                characterClass = "Warrior";
                break;
            case 2:
                characterClass = "Mage";
                break;
            case 3:
                characterClass = "Cleric";
                break;
            case 4:
                characterClass = "Thief";
                break;        
            default:
                characterClass = "Peasant";
                break;
        }

        System.out.print("Character's Strength: ");
        int str = sc.nextInt();
        System.out.print("Character's Dexterity: ");
        int dex = sc.nextInt();
        System.out.print("Character's Wisdom: ");
        int wis = sc.nextInt();
        System.out.print("Character's Charisma: ");
        int cha = sc.nextInt();


         System.out.print("Choose the character class: (1) Human | (2) Elf | (3) Dwarf | (4) - Hobbit | ");
         int raceResponse = sc.nextInt();
         

        Character character = new Character(characterName, characterSex, characterClass, str, dex, wis, cha, raceResponse);

        character.chooseRace(raceResponse);


        System.out.println();
        System.out.println("Character Sheet: ");
        System.out.println(character);



        sc.close();
    }
}
