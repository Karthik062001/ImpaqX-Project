package abstractfactory.design.pattern;

public class JavaDevFactory extends EmployeeeAbstrsctFactory {

	
	public Employee createemp() {
		
		return new JavaDev();
	}

}
