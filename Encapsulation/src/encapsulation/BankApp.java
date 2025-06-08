
package encapsulation;
import java.util.*;
public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your pin");
		int pin=sc.nextInt();
		
		System.out.println("Enter the withdrawel amount");
		int amount=sc.nextInt();
		
		Bank b=new Bank ();
		b.getData(pin, amount);
		b.setData(pin, amount);
		

		
	}

}
