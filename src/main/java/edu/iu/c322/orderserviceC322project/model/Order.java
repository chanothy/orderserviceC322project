package edu.iu.c322.orderserviceC322project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public abstract class Order {

    @Id
    private int orderId;
    private int userId;

    private String description = "unknown order item";

    // used to set up the decorator pattern maybe, not complete, need to reference the textbook
//    private ArrayList<Order> foodlist = new ArrayList();

    private int calories;
    private String size; // small medium large, will affect calories, this can be removed to reduce complexity

    @OneToOne
    private Payment payment;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
