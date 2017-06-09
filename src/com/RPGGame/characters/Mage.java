package com.RPGGame.characters;

public class Mage extends BaseCharacter {
    public Mage() {
        super();
        this.className = "Mage";
        System.out.println("Your " + this.className + " have: " + this.hp + " heal points, " + this.mana + " mana points and "
                + this.strength + " strength points. You start on level " + this.level);
    }
}