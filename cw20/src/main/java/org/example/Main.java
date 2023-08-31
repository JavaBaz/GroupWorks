package org.example;

import org.example.concreteCharacters.BaseCharacter;

public class Main {
    public static void main(String[] args) {

        CharacterFactory factory = new CharacterFactory();
        BaseCharacter target = factory.createCharacter("Mage");


        System.out.println(target.getHp());
        System.out.println("---------------");
        factory.createCharacter("Warrior").attack(target);

        System.out.println(target.getHp());

    }
}