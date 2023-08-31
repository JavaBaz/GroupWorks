package org.example.concreteCharacters;

import org.example.Character;

public class Rogue extends BaseCharacter implements Character {

    public Rogue() {
        this.speed = 6;
        this.attackPower = 6;
        this.defencePower = 4;
    }


    @Override
    public void attack(BaseCharacter target) {
        target.setHp(target.getHp() - this.attackPower);
    }

    @Override
    public void defend() {
        this.setHp(getHp()+2);
    }

    @Override
    public void move() {
        this.setStamina(getStamina()-this.speed);
    }
}
