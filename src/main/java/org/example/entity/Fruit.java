package org.example.entity;

import org.example.base.entity.BaseEntity;

public class Fruit extends BaseEntity<Integer> {

    private String name;

    private String description;

    private boolean existence;

    private int inventory;

    private int price;

    public Fruit(String name, String description, boolean existence, int inventory, int price) {
        this.name = name;
        this.description = description;
        this.existence = existence;
        this.inventory = inventory;
        this.price = price;
    }

    public Fruit(Integer integer, String name, String description, boolean existence, int inventory, int price) {
        super(integer);
        this.name = name;
        this.description = description;
        this.existence = existence;
        this.inventory = inventory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isExistence() {
        return existence;
    }

    public void setExistence(boolean existence) {
        this.existence = existence;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", existence=" + existence +
                ", inventory=" + inventory +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
