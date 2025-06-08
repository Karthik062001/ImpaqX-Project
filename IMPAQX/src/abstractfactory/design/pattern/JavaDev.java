package abstractfactory.design.pattern;

public class JavaDev implements Employee {

	public int salary()
	{
	  System.out.println("My salary");
		return 50000;
	}

	
	public String name()
	{
		System.out.println("I am java Developer");
		return "Java Dev";
	}
	

}
