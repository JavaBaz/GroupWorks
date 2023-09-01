package org.example;

import lombok.Data;

import java.io.IOException;

@Data

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    @Override
    public Dog getClone() {
        return new Dog(name, age, species, breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }


    public Dog() throws IOException {
        super();
        System.out.println("   Adding an animal ");
        System.out.println("---------------------------------------------");
        System.out.println("name" + "\t" + "age" + "\t" + "species" + "\t" + "breed");
    }

    public void showRecord() {
        System.out.println("   Adding an animal ");
        System.out.println("---------------------------------------------");
        System.out.println("name" + "\t" + "age" + "\t" + "species" + "\t" + "breed");
        System.out.println(name + "\t" + age + "\t" + species + "\t" + breed);
    }
}
