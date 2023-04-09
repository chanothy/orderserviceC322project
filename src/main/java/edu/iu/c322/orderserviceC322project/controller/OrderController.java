package edu.iu.c322.orderserviceC322project.controller;

import edu.iu.c322.orderserviceC322project.model.OrderEntity;
import edu.iu.c322.orderserviceC322project.model.OrderIngredientsEntity;
import edu.iu.c322.orderserviceC322project.model.local.OrderIngredients;
import edu.iu.c322.orderserviceC322project.model.local.Pepperoni;
import edu.iu.c322.orderserviceC322project.model.local.Pizza;
import edu.iu.c322.orderserviceC322project.model.local.Order;
import edu.iu.c322.orderserviceC322project.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderRepository repository;
    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<OrderEntity> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public int create(@RequestBody OrderEntity order) {
        OrderEntity addedOrder = repository.save(order);
        return addedOrder.orderId;
    }

    @PutMapping("/add/{orderId}")
    public void add(@RequestBody OrderIngredientsEntity ingredient, @PathVariable int orderId) {
        OrderEntity origOrderEntity = repository.getById(orderId);
        String desc = origOrderEntity.getDescription();
        int userId = origOrderEntity.getUserId();
        int calories = origOrderEntity.getCalories();
        double cost = origOrderEntity.getCost();

        Order initialOrder = new Pizza(desc,cost,calories);
        if (ingredient.getIngredientName().equals("pepperoni")) {
            Order updatedOrder = new Pepperoni(initialOrder);
//            System.out.println(updatedOrder.getDescription());
            origOrderEntity.setCalories(updatedOrder.calories());
            origOrderEntity.setCost(updatedOrder.cost());
            origOrderEntity.setDescription(updatedOrder.getDescription());
            repository.save(origOrderEntity);
        }





    }
}
