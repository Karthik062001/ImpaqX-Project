package abstractfactory.design.pattern;

public class PythonDev implements Employee{

	
	public int salary() {
		
		System.out.println("My salary");
		return 40000;
	}

	
	public String name() {
		
		System.out.println("II am Python Developer");
		return "Python Dev";
	}

}
