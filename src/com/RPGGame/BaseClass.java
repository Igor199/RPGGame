package com.RPGGame;

import java.util.Scanner;

public class BaseClass {
    public String className;
    public int hp, mana, level, strength;

    public BaseClass() {
        Scanner wpisanaLiczba = new Scanner(System.in);
        System.out.println("Enter number of HP points. You have 60 points to split");

        this.hp = wpisanaLiczba.nextInt();
        int pointsAfterHp = 60 - this.hp;
        System.out.println("Enter number of mana points. You have " + pointsAfterHp + " points left to split");

        this.mana = wpisanaLiczba.nextInt();
        int getPointsAfterMana = pointsAfterHp - this.mana;
        System.out.println("Enter number of strength points. You have " + getPointsAfterMana + " points left to split");

        this.strength = wpisanaLiczba.nextInt();
        this.level = 1;
    }

}

class ArcherClass extends BaseClass {
    public ArcherClass() {
        super();
        this.className = "Archer";
        System.out.println("Your "+this.className +" have: "+this.hp +" heal points, "+this.mana +" mana points "
                +this.strength +" strength points. You start on level "+this.level);
    }
}

class MageClass extends BaseClass {
    public MageClass() {
        super();
        this.className = "Mage";
        System.out.println("Your " + this.className + " have: " + this.hp + " heal points, " + this.mana + " mana points "
                + this.strength + " strength points. You start on level " + this.level);
    }
}

class WarriorClass extends BaseClass {
    public WarriorClass() {
        super();
        this.className = "Warrior";
        System.out.println("Your " + this.className + " have: " + this.hp + " heal points, " + this.mana + " mana points "
                + this.strength + " strength points. You start on level " + this.level);
    }
}
