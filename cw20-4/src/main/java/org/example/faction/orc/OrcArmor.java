package org.example.faction.orc;

import org.example.item.Armor;

public class OrcArmor  implements Armor {
    @Override
    public void equip() {
        System.out.println("Orc equipped the Armor");
    }

    @Override
    public void dismiss() {
        System.out.println("Orc dismissed the Armor");
    }
}


