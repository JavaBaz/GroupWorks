package org.example.faction.elf;

import org.example.item.Characters;

public class ElfCharacter  implements Characters {
    @Override
    public void run() {
        System.out.println("Elf is running");
    }

    @Override
    public void jump() {
        System.out.println("Elf is jumping");
    }

    @Override
    public void attack() {
        System.out.println("Elf is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Elf is defending");
    }
}
