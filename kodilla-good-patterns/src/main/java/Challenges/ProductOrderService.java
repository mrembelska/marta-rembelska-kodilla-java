package Challenges;


import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    private int orderId;
    LocalDateTime dataCreatorOrder;
    LocalDateTime dataSendOrder;

    public Order createOrder() {
        return new Order(new Product("01","Book", 300.0),
                new User("Marta", "Rembelska", "user@gmail.com", "12345"));
    }
}
