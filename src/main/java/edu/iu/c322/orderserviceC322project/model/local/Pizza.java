package edu.iu.c322.orderserviceC322project.model.local;

public class Pizza extends Order{

    public double cost;
    public int calories;

    public Pizza(String description, double cost, int calories) {
        this.description = "Pizza";
        this.cost = cost;
        this.calories = calories;
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public int calories() {
        return calories;
    }
}
