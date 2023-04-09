package edu.iu.c322.orderserviceC322project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderIngredientsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ingredientID;
    private String ingredientName;

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
