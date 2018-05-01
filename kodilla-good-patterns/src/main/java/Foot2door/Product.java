package Foot2door;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    String productName;
    int productQuantity;
    LocalDate productExpirationDate;
    boolean productWithGluten;

    public Product(String productName, int productQuantity, LocalDate productExpirationDate, boolean productWithGluten) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productExpirationDate = productExpirationDate;
        this.productWithGluten = productWithGluten;
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

    public boolean isProductWithGluten() {
        return productWithGluten;
    }


    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + productQuantity;
        result = 31 * result + (productExpirationDate != null ? productExpirationDate.hashCode() : 0);
        result = 31 * result + (productWithGluten ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productQuantity != product.productQuantity) return false;
        if (productWithGluten != product.productWithGluten) return false;
        if (!productName.equals(product.productName)) return false;
        return productExpirationDate != null ? productExpirationDate.equals(product.productExpirationDate) : product.productExpirationDate == null;
    }
}
