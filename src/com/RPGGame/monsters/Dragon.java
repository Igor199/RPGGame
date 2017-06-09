package com.RPGGame.monsters;

public class Dragon extends Monster {
    public Dragon(String charactersName) {
        this.charactersName = charactersName;
        this.monsterName = "Dragon";
        this.monsterHp = 1500;
        this.monsterMana = 200;
        this.monsterLevel = 10;
        System.out.println(charactersName + ", you fight with: Dragon");
    }
}