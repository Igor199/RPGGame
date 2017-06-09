package com.RPGGame.monsters;

public class Wolf extends Monster {
    public Wolf(String characterName) {
        this.charactersName = characterName;
        this.monsterName = "Wolf";
        this.monsterHp = 40;
        this.monsterMana = 0;
        this.monsterLevel = 2;
        System.out.println(charactersName + ", you fight with: Wolf");
    }
}