package org.example;

import org.example.factory.ElfFactory;
import org.example.factory.ItemFactory;
import org.example.factory.OrcFactory;

public class Main {
    public static void main(String[] args) {

        ItemFactory elfFactory = new ElfFactory();
        ItemFactory orcFactory = new OrcFactory();

        var elf1 = elfFactory.createCharacter();
        elf1.attack();
    }
}