package Week2;

public class Student {
	private String name;
	private int age;
	private String course;

	public Student(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public void displayInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
	}

    public static void main(String[] args) {
        Student s = new Student("Arjun", 21, "IT");
        s.displayInfo();
    }
}
