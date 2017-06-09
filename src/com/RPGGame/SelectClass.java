package com.RPGGame;

import com.RPGGame.characters.Archer;
import com.RPGGame.characters.BaseCharacter;
import com.RPGGame.characters.Mage;
import com.RPGGame.characters.Warrior;
import com.RPGGame.monsters.Monster;

import java.util.Scanner;

public class SelectClass {

    public static BaseCharacter createCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 to pick Archer, 2 to pick Mage, 3 to pick Warrior");
        int chosenNumber = scanner.nextInt();

        if (chosenNumber == 1) {
            System.out.println("You choose Archer");
            Archer archer = new Archer();
            return archer;
        } else if (chosenNumber == 2) {
            System.out.println("You choose com.RPGGame.characters.Mage");
            Mage mage = new Mage();
            return mage;
        } else if (chosenNumber == 3) {
            System.out.println("You choose Warrior");
            Warrior warrior = new Warrior();
            return warrior;
        } else {
            System.out.println("Wrong number");
            return SelectClass.createCharacter();
        }
    }

}