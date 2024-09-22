package creational;

import common.Customer;
import common.Manager;
import common.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void testManagerFactoryCreatesManager() {
        BaseUserFactory factory = new ManagerFactory();
        User user = factory.create();
        assertTrue(user instanceof Manager);
    }

    @Test
    public void testCustomerFactoryCreatesCustomer() {
        BaseUserFactory factory = new CustomerFactory();
        User user = factory.create();
        assertTrue(user instanceof Customer);
    }
}
