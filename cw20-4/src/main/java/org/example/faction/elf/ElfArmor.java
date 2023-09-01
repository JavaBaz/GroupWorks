package org.example.faction.elf;

import org.example.item.Armor;

public class ElfArmor implements Armor {
    @Override
    public void equip() {
        System.out.println("Elf equipped the Armor");
    }

    @Override
    public void dismiss() {
        System.out.println("Elf dismissed the Armor");
    }
}
