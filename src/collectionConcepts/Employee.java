package collectionConcepts;

public class Employee {

	String name;
	int age;
	String city;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public Employee(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	
}
