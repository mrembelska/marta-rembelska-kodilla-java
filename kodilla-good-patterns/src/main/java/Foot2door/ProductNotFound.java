package Foot2door;

import java.time.LocalDateTime;

public class ProductNotFound implements Process {

    public boolean process() {
        System.out.println("Nie znaleziono produktu");
        return false;

    }
}
