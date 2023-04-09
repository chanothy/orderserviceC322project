package edu.iu.c322.orderserviceC322project.model.local;

public class Pepperoni extends OrderIngredients {

    public Pepperoni(Order order) {
        this.order = order;
    }

    public String getDescription() {
        return order.getDescription() + " with Pepperoni";
    }

    public double cost() {
        return .30 + order.cost();
    }

    public int calories() {
        return 100 + order.calories();
    }
}
