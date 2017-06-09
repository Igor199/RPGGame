package com.RPGGame.characters;


public class Warrior extends BaseCharacter {
    public Warrior() {
        super();
        //this.charactersName = charactersName;
        this.className = "Warrior";
        System.out.println("Your " + this.className + " have: " + this.hp + " heal points, " + this.mana + " mana points and "
                + this.strength + " strength points. You start on level " + this.level);
    }
}
