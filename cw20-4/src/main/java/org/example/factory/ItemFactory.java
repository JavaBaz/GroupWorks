package org.example.factory;

import org.example.item.Armor;
import org.example.item.Characters;
import org.example.item.Weapon;

public interface ItemFactory {

    Characters createCharacter();
    Weapon createWeapon();
    Armor createArmor();

}
