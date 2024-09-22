package common;

public class Customer implements User {
    @Override
    public String getRole() {
        return "Customer";
    }
}