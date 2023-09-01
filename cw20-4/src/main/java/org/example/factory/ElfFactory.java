package org.example.factory;

import org.example.faction.elf.ElfArmor;
import org.example.faction.elf.ElfCharacter;
import org.example.faction.elf.ElfWeapon;
import org.example.item.Armor;
import org.example.item.Characters;
import org.example.item.Weapon;

public class ElfFactory implements ItemFactory{
    @Override
    public Characters createCharacter() {
        return new ElfCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new ElfWeapon();
    }

    @Override
    public Armor createArmor() {
        return new ElfArmor();
    }
}
