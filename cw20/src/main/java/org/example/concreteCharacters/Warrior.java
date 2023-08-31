package org.example.concreteCharacters;

import org.example.Character;

public class Warrior extends BaseCharacter implements Character  {


    public Warrior() {
        this.speed = 4;
        this.attackPower = 8;
        this.defencePower = 5;
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
