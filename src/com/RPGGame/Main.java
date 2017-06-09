package com.RPGGame;

import com.RPGGame.characters.BaseCharacter;
import com.RPGGame.monsters.Monster;
import com.RPGGame.monsters.MonsterFactory;

import java.util.Scanner;

public class Main {
    public String charactersName;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type character's name");
        String charactersName = scanner.nextLine();

        BaseCharacter character = SelectClass.createCharacter();
        Monster monster = MonsterFactory.createMonster(character, charactersName);
        monster.charactersName = charactersName;
        Combat fight = new Combat();

    }
}
