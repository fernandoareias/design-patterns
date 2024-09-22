package creational;

import common.Customer;
import common.Manager;
import common.User;

import java.util.HashMap;
import java.util.Map;

abstract class BaseUserFactoryMethod {
    public abstract User createUser(String type);
}


class UserFactory extends BaseUserFactoryMethod {
    private final Map<String, Class<? extends User>> userMap;

    public UserFactory() {
        userMap = new HashMap<>();
        userMap.put("manager", Manager.class);
        userMap.put("customer", Customer.class);
    }

    @Override
    public User createUser(String type) {
        Class<? extends User> userClass = userMap.get(type.toLowerCase());
        if (userClass != null) {
            try {
                return userClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
