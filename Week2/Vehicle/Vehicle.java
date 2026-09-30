package Week2.Vehicle;

public class Vehicle {
	protected String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}

	public void move() {
		System.out.println(brand + " is moving.");
	}

	public static void main(String[] args) {
		Vehicle v1 = new Car("Toyota");
		Vehicle v2 = new Bike("Platinum");
		v1.move();
		v2.move();
	}
}
