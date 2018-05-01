package Foot2door;

import java.util.HashSet;

public class SelectProcess {

    OrderFood orderFood;

    public SelectProcess(OrderFood orderFood) {
        this.orderFood = orderFood;
    }

    HashSet<Product> productExtraFoodShop = new HashSet<>();
    HashSet<Product> productHealthyShop = new HashSet<>();
    HashSet<Product> productGlutenFreeShop = new HashSet<>();

    Process select() {
        for (Product theProduct : productExtraFoodShop) {
            if ((theProduct.productName == orderFood.productName) && (theProduct.productQuantity >= orderFood.productQuantity)) {
                return new ExtraFoodShop();
            }
        }

        for (Product theProduct : productHealthyShop) {
            if ((theProduct.productName == orderFood.productName) && (theProduct.productQuantity >= orderFood.productQuantity)) {
                return new HealthyShop();
            }
        }

        for (Product theProduct : productGlutenFreeShop) {
            if ((theProduct.productName == orderFood.productName) && (theProduct.productQuantity >= orderFood.productQuantity)) {
                return new GlutenFreeShop();
            }
        }
        return new ProductNotFound();
    }
}
