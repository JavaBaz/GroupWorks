package org.example.concreteCharacters;

import org.example.Character;

public class Mage extends BaseCharacter implements Character {

    public Mage() {
        this.speed = 7;
        this.attackPower = 2;
        this.defencePower = 4;
    }

    @Override
    public void attack(BaseCharacter target) {
        target.setHp(target.getHp() - this.attackPower - 2);
    }

    @Override
    public void defend() {
        this.setHp(getHp()+5);
    }

    @Override
    public void move() {
        this.setStamina(getStamina()- this.speed + 1);
    }
}
