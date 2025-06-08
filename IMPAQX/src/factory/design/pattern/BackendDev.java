package factory.design.pattern;

public class BackendDev implements Employee{
	
	public int salary()
	{
		System.out.println("Backend dev salary ");
		return 50000;
	}

}
