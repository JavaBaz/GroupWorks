package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Data
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


    public Animal() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("   Adding an animal ");
        System.out.println("---------------------------------------------");
        System.out.println("name" + "\t" + "age" + "\t" + "species");

        String name = br.readLine();
        System.out.print("\t");

        int age = Integer.parseInt(br.readLine());
        System.out.print("\t");

        String species = br.readLine();
        System.out.print("\t");
    }

    public void showRecord() {
        System.out.println("   Adding an animal ");
        System.out.println("---------------------------------------------");
        System.out.println("name" + "\t" + "age" + "\t" + "species");
        System.out.println(name + "\t" + age + "\t" + species);
    }
}
