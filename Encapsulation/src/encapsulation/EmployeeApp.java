package encapsulation;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
	  //  Employee e1= new Employee();
	    //e1.setData(13, "Karthik", 23);
	     //System.out.println(e1.getid());
	    //System.out.println(e1.getName());
	   //System.out.println( e1.getage());
	   
	   Employee e2=new Employee(14,"Anjali",23);
	   System.out.println(e2.getid()+" "+e2.getName()+" "+e2.getage());

	   Employee e3=new Employee(15,"Karanju",23);
	   System.out.println(e3.getid()+" "+e3.getName()+" "+e3.getage());
	}

}
