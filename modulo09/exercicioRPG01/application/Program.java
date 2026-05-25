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

       //Character Class
        System.out.print("Choose the character class: (1) Warrior | (2) Mage | (3) Cleric | (4) - Thief: - ");        
        int classResponse = sc.nextInt();

        sc.nextLine();        

        //Character Attributes
        System.out.print("Character's Strength: ");
        int str = sc.nextInt();
        System.out.print("Character's Dexterity: ");
        int dex = sc.nextInt();
        System.out.print("Character's Wisdom: ");
        int wis = sc.nextInt();
        System.out.print("Character's Charisma: ");
        int cha = sc.nextInt();

        //Character Race
         System.out.print("Choose the character Race: (1) Human | (2) Elf | (3) Dwarf | (4) - Hobbit | ");
         int raceResponse = sc.nextInt();
         
         sc.nextLine();

         //Character Skills
         System.out.println("Você tem " + wis + " perícia(s).");
         String characterSkills = "";

        for (int i = 0; i < wis; i++) {
            System.out.print( (i+1) + "ª Perícia: ");
            String skill = sc.nextLine();

            if(i == 0) {
                characterSkills += skill;
            } else {
                characterSkills += ", " + skill;
            }
        }               

        //Character constructor
        Character character = new Character(characterName, characterSex, classResponse, str, dex, wis, cha, raceResponse, characterSkills);

        //Character Sheet
        System.out.println();
        System.out.println("Character Sheet: ");
        System.out.println(character);

        sc.close();
    }
}