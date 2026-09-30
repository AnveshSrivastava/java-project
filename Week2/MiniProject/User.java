package Week2.MiniProject;

public abstract class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayRole();
}