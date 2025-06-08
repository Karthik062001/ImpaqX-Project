package database.connection;

import java.util.*;

public class MainMethod {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the model");
		int a=sc.nextInt();
		
		System.out.println("Enter the device Name");
		String b=sc.next();
		
		System.out.println("Enter the OS");
		String c= sc.next();
		
		System.out.println("Enter the price of device");
		int d=sc.nextInt();
//		
//		PhoneBiulder device=new PhoneBiulder();
//		device.setModel(3535);
//		device.setName("Vivo");
//		device.setOS("Android");
//		device.setPrice(34900);
//		device.phone();
		
		PhoneBiulder device=new PhoneBiulder().setModel(d).setName(c).setOS(c).setPrice(d);
		ModelClass md=device.phone();
		
		//ModelClass ref=new ModelClass(a,b,c,d);
		DatabaseHandler data=new DatabaseHandler();
		data.insertData(md);
	
		
	}

}
