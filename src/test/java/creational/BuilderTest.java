package creational;

import common.Product;
import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void testBuildProductSuccessfully() {

        Builder builder = new Builder();
        String expectedName = "Laptop";
        String expectedCategory = "Electronics";
        BigDecimal expectedPrice = new BigDecimal("1200.00");

        Product product = builder.setName(expectedName)
                .setCategory(expectedCategory)
                .setPrice(expectedPrice)
                .build();

        assertNotNull(product);
        assertEquals(expectedName, product.getName());
        assertEquals(expectedCategory, product.getCategory());
        assertEquals(expectedPrice, product.getPrice());
    }

    @Test
    public void testBuildProductThrowsExceptionWhenNameIsNull() {
        Builder builder = new Builder();
        builder.setCategory("Electronics").setPrice(new BigDecimal("1200.00"));

        Exception exception = assertThrows(IllegalStateException.class, builder::build);
        assertEquals("Name, category, and price must be set.", exception.getMessage());
    }

    @Test
    public void testBuildProductThrowsExceptionWhenCategoryIsNull() {
        Builder builder = new Builder();
        builder.setName("Laptop").setPrice(new BigDecimal("1200.00"));

        Exception exception = assertThrows(IllegalStateException.class, builder::build);
        assertEquals("Name, category, and price must be set.", exception.getMessage());
    }

    @Test
    public void testBuildProductThrowsExceptionWhenPriceIsNull() {
        Builder builder = new Builder();
        builder.setName("Laptop").setCategory("Electronics");

        Exception exception = assertThrows(IllegalStateException.class, builder::build);
        assertEquals("Name, category, and price must be set.", exception.getMessage());
    }
}
