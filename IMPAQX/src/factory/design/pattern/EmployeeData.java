package factory.design.pattern;

import java.util.Scanner;

public class EmployeeData {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter which developer salary you want see");
		String a=sc.nextLine();
		Employee emp =EmployeeFactory.getEmp(a);
		int salary=emp.salary();
		System.out.println(salary);
		
	
	}

}
