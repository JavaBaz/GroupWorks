package org.example.faction.orc;

import org.example.item.Weapon;

public class OrcWeapon extends Weapon {
    @Override
    public void equip() {
        System.out.println("Orc equipped the Weapon");
    }

    @Override
    public void dismiss() {
        System.out.println("Orc dismissed the Weapon");
    }
}
