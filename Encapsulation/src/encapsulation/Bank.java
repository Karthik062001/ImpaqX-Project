package encapsulation;

public class Bank {

	private int balance=10000;
	private int pin=123;
	
	public void setData(int key , int amount)
	{
		if(key==pin)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("Invalid Customer");
			System.exit(0);
		}
	}
	public void getData(int key , int amount)
	{
		if(key==pin)
		{
			System.out.println("The given money is "+amount);
			System.out.println("the new balance is "+ (balance-amount));
		}
		else
		{
			System.out.println("Invalid Customer");
			System.exit(0);
		}
	}
}
