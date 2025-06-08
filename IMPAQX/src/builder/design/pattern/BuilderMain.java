package builder.design.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BuilderMain {

	public static void main(String[] args) throws  SQLException {
	
	
		PhoneBuilder builder=new PhoneBuilder().setModel(0).setName("vivo").setOS("Android");
		Phone p=builder.getPhone();
		System.out.println(p);
		
		PhoneBuilder builder1=new PhoneBuilder().setModel(343945).setName("vivo").setOS("Android").setName("samsung");
		Phone p1=builder1.getPhone();
		System.out.println(p1);
	}

}
