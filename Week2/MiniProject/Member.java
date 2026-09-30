package Week2.MiniProject;

public class Member extends User {
    public Member(String name) {
        super(name);
    }

    public void displayRole() {
        System.out.println(getName() + " is a library member.");
    }
}