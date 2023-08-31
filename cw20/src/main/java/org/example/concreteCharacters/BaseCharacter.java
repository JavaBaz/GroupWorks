package org.example.concreteCharacters;


import org.example.Character;

public class BaseCharacter implements Character {

     int hp = 100;
     int speed;
     int stamina = 100;
     int attackPower;
     int defencePower;


     public int getHp() {
          return hp;
     }

     public void setHp(int hp) {
          this.hp = hp;
     }

     public int getSpeed() {
          return speed;
     }

     public void setSpeed(int speed) {
          this.speed = speed;
     }

     public int getStamina() {
          return stamina;
     }

     public void setStamina(int stamina) {
          this.stamina = stamina;
     }

     public int getAttackPower() {
          return attackPower;
     }

     public void setAttackPower(int attackPower) {
          this.attackPower = attackPower;
     }

     public int getDefencePower() {
          return defencePower;
     }

     public void setDefencePower(int defencePower) {
          this.defencePower = defencePower;
     }

     @Override
     public void attack(BaseCharacter target) {

     }

     @Override
     public void defend() {

     }

     @Override
     public void move() {

     }
}
