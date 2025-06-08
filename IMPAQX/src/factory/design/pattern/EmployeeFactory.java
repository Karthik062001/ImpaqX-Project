package factory.design.pattern;

public class EmployeeFactory {

	
	public static Employee getEmp(String emptype)
	{
		if(emptype.trim().equalsIgnoreCase("FrontEndDev"))
		{
			return new FrontendDev();
		}
		else if(emptype.trim().equalsIgnoreCase("BackendDev"))
		{
			return new BackendDev();
		}
		else {
			 return null;
		}
	}
}
