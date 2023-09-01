package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car.CarBuilder()
                .setNumberofDoors(NumberDoors.passInt(2))
                .build();

//        System.out.println(car1);
        System.out.println(NumberDoors.TWO.getOptional());
    }
}