package Foot2door;

import java.time.LocalDateTime;

public class GlutenFreeShop implements Process {

    public boolean process() {
        System.out.println("Product from order found in " + getClass().getSimpleName());
        System.out.println(LocalDateTime.now() + " Send it from the producent");
        System.out.println(LocalDateTime.now() + " Otrzymano potwierdzenie");
        System.out.println(LocalDateTime.now() + " Zapisano w bazie");
        return true;
    }
}
