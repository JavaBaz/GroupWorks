package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal implements Prototype<Animal> {
    protected String name;
    protected int age;
    protected String species;

    public void makeSound(){
        System.out.println("The animal makes a sound");
    }


    @Override
    public Animal getClone() {
        return new Animal(name,age,species);
    }
}
