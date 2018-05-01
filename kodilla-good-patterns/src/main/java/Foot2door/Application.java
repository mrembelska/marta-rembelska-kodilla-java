package Foot2door;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args){

        OrderFood orderFood = new OrderFood("Hummus", 1000, LocalDate.of(2018,05,01), false);

        Product product1 = new Product("Onion", 200, LocalDate.of(2018,05,01),false);
        Product product2 = new Product("Carrot", 34, LocalDate.of(2018,05,01), false);
        Product product3 = new Product("Hummus", 234, LocalDate.of(2018,05,03), true);

        SelectProcess selectProcess = new  SelectProcess(orderFood);

        selectProcess.productExtraFoodShop.add(product1);
        selectProcess.productHealthyShop.add(product2);
        selectProcess.productGlutenFreeShop.add(product3);

        if (selectProcess.select().process()) {
            System.out.println("Proces zamównienia zakończono pomyślenie");
        } else {
            System.out.println("Nie złożono zamównienia");
        }
    }
}
