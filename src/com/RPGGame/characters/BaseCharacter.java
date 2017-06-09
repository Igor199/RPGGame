package com.RPGGame.characters;

import java.util.Scanner;

public class BaseCharacter {
    public String className;
    public int hp, mana, level, strength;

    public BaseCharacter() {
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





