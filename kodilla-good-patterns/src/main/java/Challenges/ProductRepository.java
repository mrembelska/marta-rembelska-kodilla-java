package Challenges;

public class ProductRepository implements OrderRepository{

    @Override
    public void saveOrderInTheBase(Order order) {
        System.out.println("Order has been saved");
    }
}
