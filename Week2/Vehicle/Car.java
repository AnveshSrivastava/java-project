package Week2.Vehicle;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " car drives on four wheels.");
    }
}