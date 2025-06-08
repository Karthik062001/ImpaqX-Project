package abstractfactory.design.pattern;

public class EmployeeData {

	public static void main(String[] args) {

	Employee e1 =	EmployeeFactory.getemp(new JavaDevFactory());
		String name=e1.name();
		int salary=e1.salary();
		System.out.println(name);
		System.out.println(salary);
	}

}
