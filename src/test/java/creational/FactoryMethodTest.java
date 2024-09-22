package creational;

import org.junit.Test;
import static org.junit.Assert.*;
import common.Customer;
import common.Manager;
import common.User;

public class FactoryMethodTest {

    @Test
    public void testCreateManager() {
        BaseUserFactoryMethod factory = new UserFactory();
        User user = factory.createUser("manager");

        assertNotNull(user);
        assertTrue(user instanceof Manager);
        assertEquals("Manager", user.getRole());
    }

    @Test
    public void testCreateCustomer() {
        BaseUserFactoryMethod factory = new UserFactory();
        User user = factory.createUser("customer");

        assertNotNull(user);
        assertTrue(user instanceof Customer);
        assertEquals("Customer", user.getRole());
    }

    @Test
    public void testCreateInvalidUser() {
        BaseUserFactoryMethod factory = new UserFactory();
        User user = factory.createUser("invalid");

        assertNull(user);
    }

    @Test
    public void testCreateManagerCaseInsensitivity() {
        BaseUserFactoryMethod factory = new UserFactory();
        User user = factory.createUser("MANAGER");

        assertNotNull(user);
        assertTrue(user instanceof Manager);
        assertEquals("Manager", user.getRole());
    }

    @Test
    public void testCreateCustomerCaseInsensitivity() {
        BaseUserFactoryMethod factory = new UserFactory();
        User user = factory.createUser("CUSTOMER");

        assertNotNull(user);
        assertTrue(user instanceof Customer);
        assertEquals("Customer", user.getRole());
    }
}
