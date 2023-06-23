package org.example.entity;

import org.example.base.entity.BaseEntity;

public class Order extends BaseEntity<Integer> {
    private int userId;

    private int fruitId;

    private Status status;

    private int amount;

    public Order(int userId, int fruitId, Status status, int amount) {
        this.userId = userId;
        this.fruitId = fruitId;
        this.status = status;
        this.amount = amount;
    }

    public Order(Integer integer, int userId, int fruitId, Status status, int amount) {
        super(integer);
        this.userId = userId;
        this.fruitId = fruitId;
        this.status = status;
        this.amount = amount;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", fruitId=" + fruitId +
                ", status=" + status +
                ", amount=" + amount +
                ", id=" + id +
                '}';
    }
}
