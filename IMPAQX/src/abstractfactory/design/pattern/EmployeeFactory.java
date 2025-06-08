package abstractfactory.design.pattern;

public class EmployeeFactory {

	public static Employee getemp(EmployeeeAbstrsctFactory fctr)
	{
		return fctr.createemp();
	}
}
