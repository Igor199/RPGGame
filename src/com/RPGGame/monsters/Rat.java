package com.RPGGame.monsters;

public class Rat extends Monster {
    public Rat(String characterName) {
        this.charactersName = characterName;
        this.monsterName = "Rat";
        this.monsterHp = 30;
        this.monsterMana = 0;
        this.monsterLevel = 1;
        System.out.println(charactersName + ", you fight with: Rat");
    }

}
