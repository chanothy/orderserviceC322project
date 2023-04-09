import edu.iu.c322.orderserviceC322project.model.local.Pizza;
import edu.iu.c322.orderserviceC322project.model.local.Order;
import edu.iu.c322.orderserviceC322project.model.local.Pepperoni;

public class test {
    public static void main(String[] args) {
        Order order = new Pizza("Pizza",1,400);
        System.out.println(order.getDescription() + " " + order.cost());

        Order updatedOrder = new Pepperoni(order);
        System.out.println(updatedOrder.getDescription()+  " " + updatedOrder.cost());
    }
}
