package com.RPGGame;

import java.util.Scanner;

public class selectClass {
    public static void getChoosenNumber() {
        Scanner wpisanaLiczba = new Scanner(System.in);
        System.out.println("Choose 1 to pick Archer, 2 to pick Mage, 3 to pick Warrior");
        int choosenNumber = wpisanaLiczba.nextInt();

        if (choosenNumber == 1) {
            System.out.println("You choose Archer");
            ArcherClass archer = new ArcherClass();
        } else if (choosenNumber == 2) {
            System.out.println("You choose Mage");
            MageClass mage = new MageClass();
        } else if (choosenNumber == 3) {
            System.out.println("You choose Warrior");
            WarriorClass warrior = new WarriorClass();
        } else  {
            System.out.println("Type 1, 2 or 3 to pick Archer, Mage or Warrior");
            selectClass.getChoosenNumber();
        }

    }

}