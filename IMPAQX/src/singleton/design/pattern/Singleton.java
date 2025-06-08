package singleton.design.pattern;

public class Singleton {
	
	//creating  private variable
	private static Singleton ob1;
	
	//constructor
	 private Singleton()
	  {
		  
	  }
	 
	 public static Singleton getInstance()
	 {
		 if(ob1==null)
		 {
			 //object of this class
			Singleton ob1=new Singleton();
		
		 }
		 return ob1;	
		 
	 }


}
