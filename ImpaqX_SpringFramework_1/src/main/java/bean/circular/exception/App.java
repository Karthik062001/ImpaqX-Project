package bean.circular.exception;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext();
		
		Alphabet data = context.getBean(Alphabet.class);
		data.dosome();
	}

}
