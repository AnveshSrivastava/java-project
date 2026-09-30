package Week2.Vehicle;

public class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " bike rides on two wheels.");
    }
}