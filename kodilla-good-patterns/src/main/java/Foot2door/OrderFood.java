package Foot2door;

import java.time.LocalDate;

public class OrderFood {

    public String productName;
    public int productQuantity;
    public LocalDate productExpirationDate;
    public boolean productWithGluten;

    public OrderFood(String productName, int productQuantity, LocalDate productExpirationDate, boolean productWtihGluten) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productExpirationDate = productExpirationDate;
        this.productWithGluten = productWtihGluten;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public LocalDate getProductExpirationDate() {
        return productExpirationDate;
    }

    public boolean isProductWtihGluten() {
        return productWithGluten;
    }
}

