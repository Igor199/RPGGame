package com.RPGGame.characters;

public class Archer extends BaseCharacter {
    public Archer() {
        super();
        this.className = "Archer";
        System.out.println("Your " + this.className + " have: " + this.hp + " heal points, " + this.mana + " mana points and "
                + this.strength + " strength points. You start on level " + this.level);
    }
}

