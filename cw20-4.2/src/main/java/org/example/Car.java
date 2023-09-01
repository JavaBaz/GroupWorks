package org.example;

public class Car {

    private String brandModel;
    private int year;
    private String color;
    private Type type;
    private double engineSize;
    private NumberDoors numberDoors;

    @Override
    public String toString() {
        return "Car{" +
                "brandModel='" + brandModel + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", type=" + type +
                ", engineSize=" + engineSize +
                ", numberDoors=" + numberDoors +
                '}';
    }

    private Car(CarBuilder carBuilder ) {
        this.brandModel    = carBuilder.brandModel;
        this.year          = carBuilder.year;
        this.color         = carBuilder.color;
        this.type          = carBuilder.type;
        this.engineSize    = carBuilder.engineSize;
        this.numberDoors = carBuilder.numberDoors;
    }

    public static class CarBuilder{
        private String brandModel;
        private int year;
        private String color;
        private Type type;
        private double engineSize;
        private NumberDoors numberDoors;

        public CarBuilder setBrandModel(String brandModel) {
            this.brandModel = brandModel;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        public CarBuilder setEngineSize(double engineSize) {
            this.engineSize = engineSize;
            return this;
        }

        public CarBuilder setNumberofDoors(NumberDoors numberDoors) {
            this.numberDoors = numberDoors;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
