package bean.creation.excption;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String []args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanCreationException.xml");
		Employee emp=context.getBean("emp1",Employee.class);
		emp.display();
		System.out.println(emp.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	} 
}
//no defaut constructor  then its show the bean creation exception