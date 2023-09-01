package org.example.faction.orc;

import org.example.item.Characters;

public class OrcCharacter  implements Characters {
    @Override
    public void run() {
        System.out.println("Orc is running");
    }

    @Override
    public void jump() {
        System.out.println("Orc is jumping");
    }

    @Override
    public void attack() {
        System.out.println("Orc is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Orc is defending");
    }
}


