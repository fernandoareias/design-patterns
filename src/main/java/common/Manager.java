package common;

public class Manager implements User {
    @Override
    public String getRole() {
        return "Manager";
    }
}