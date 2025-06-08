package singleton.design.pattern;

public class SingletonDesign {
	
	public static void main(String[]args)
	{
		Singleton obj=Singleton.getInstance();
		System.out.println(obj);
		Singleton obj1=Singleton.getInstance();
		System.out.println(obj1);
		
		}

}
