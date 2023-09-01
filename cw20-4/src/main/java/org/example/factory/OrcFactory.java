package org.example.factory;

import org.example.faction.orc.OrcArmor;
import org.example.faction.orc.OrcCharacter;
import org.example.faction.orc.OrcWeapon;
import org.example.item.Armor;
import org.example.item.Characters;
import org.example.item.Weapon;

public class OrcFactory implements ItemFactory{
    @Override
    public Characters createCharacter() {
        return new OrcCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new OrcWeapon();
    }

    @Override
    public Armor createArmor() {
        return new OrcArmor();
    }
}
