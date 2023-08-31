package org.example;

import org.example.concreteCharacters.BaseCharacter;

public interface Character {

    void attack(BaseCharacter target);
    void defend();
    void move();

}
