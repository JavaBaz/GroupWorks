package org.example;

public class Main {
    public static void main(String[] args) {

        Animal baseAnimal = new Animal("pishi",5,"Cat");
        baseAnimal.getClone();
        Animal testClone1 =  baseAnimal.getClone();
        testClone1.setName("pish pissshi");

        Dog dog1 = new Dog("hapoo",9,"Dog","poodle");

        Dog dog2 = dog1.getClone();
        dog2.setName("hop hapooo");

        Dog dog3 = dog1.getClone();
        dog3.setName("sag");
        dog3.setAge(12);

//        dog3.makeSound();
//        baseAnimal.makeSound();

        System.out.println(dog3);


    }
}