package bean.creation.excption;

public class Employee {

	int age;
	String name;
	int salary;
	
	public Employee(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
//	public Employee() {
//		
//	}
	
	public void display()
	{
		System.out.println("Hello");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
