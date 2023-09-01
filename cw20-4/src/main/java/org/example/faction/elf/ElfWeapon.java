package org.example.faction.elf;

import org.example.item.Weapon;

public class ElfWeapon implements Weapon {
    @Override
    public void equip() {
        System.out.println("Elf equipped the Weapon");
    }

    @Override
    public void dismiss() {
        System.out.println("Elf dismissed the Weapon");
    }
}
