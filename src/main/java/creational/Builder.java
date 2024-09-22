package creational;

import common.Product;

import java.math.BigDecimal;

public class Builder {
    private String name;
    private String category;
    private BigDecimal price;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setCategory(String category) {
        this.category = category;
        return this;
    }

    public Builder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Product build() {
        if (name == null || category == null || price == null) {
            throw new IllegalStateException("Name, category, and price must be set.");
        }

        return new Product(name, category, price);
    }
}
