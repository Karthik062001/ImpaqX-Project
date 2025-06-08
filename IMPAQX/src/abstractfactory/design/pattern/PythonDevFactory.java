package abstractfactory.design.pattern;

public class PythonDevFactory extends EmployeeeAbstrsctFactory {

	
	public Employee createemp() {
		
		return new PythonDev();
	}
	

}
