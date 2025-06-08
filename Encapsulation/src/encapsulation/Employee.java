package encapsulation;

public class Employee {

	private int id;
	private String Name;
	private int age ;
	
	
	public Employee(int id, String Name, int age)    //public void setData(int id, String Name, int age) 
	{
		this.id=id;
		this.Name=Name;
		this.age=age;
		
	}
	public int getid()
	{
		return id;
	}
	public String getName()
	{
		return Name;
	}
	public int getage()
	{
		return age;
	}
}
