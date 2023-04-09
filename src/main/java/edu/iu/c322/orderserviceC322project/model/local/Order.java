package edu.iu.c322.orderserviceC322project.model.local;

import jakarta.persistence.*;

public abstract class Order {

    public String description;

    public String description() {
        return description;
    }
//    @OneToOne
//    private Payment payment;

    public abstract double cost();

    public abstract int calories();




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Payment getPayment() {
//        return payment;
//    }
//
//    public void setPayment(Payment payment) {
//        this.payment = payment;
//    }
}
