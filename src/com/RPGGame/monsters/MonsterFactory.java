package com.RPGGame.monsters;

import com.RPGGame.characters.BaseCharacter;

public class MonsterFactory {
    public static Monster createMonster(BaseCharacter character, String characterName) {
        switch (character.level) {
            case 1:
                Rat rat = new Rat(characterName);
                return rat;

            case 2:
                return new Wolf(characterName);

            case 10:
                return new Dragon(characterName);

            default:
                System.out.println("There is no opponent for this level, you are facing Rat");
                return new Rat(characterName);
        }
    }
}
