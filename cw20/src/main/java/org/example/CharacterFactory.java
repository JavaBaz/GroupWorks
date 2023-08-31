package org.example;

import org.example.concreteCharacters.BaseCharacter;
import org.example.concreteCharacters.Mage;
import org.example.concreteCharacters.Rogue;
import org.example.concreteCharacters.Warrior;

public class CharacterFactory <T extends BaseCharacter> {

    <T extends BaseCharacter> T createCharacter(String type){
         if (type.equals("Warrior"))
             return (T) new Warrior();
         if (type.equals("Mage"))
             return (T) new Mage();
         if (type.equals("Rogue"))
             return (T) new Rogue();

         return null;
     }
}
