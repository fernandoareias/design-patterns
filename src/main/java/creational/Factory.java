package creational;

import common.Customer;
import common.Manager;
import common.User;

abstract class BaseUserFactory {
    public abstract User create();
}

class ManagerFactory extends BaseUserFactory {

    @Override
    public User create() {
        return new Manager();
    }
}

class CustomerFactory extends BaseUserFactory {
    @Override
    public User create() {
        return new Customer();
    }
}