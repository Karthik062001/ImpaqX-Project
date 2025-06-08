package builder.design.pattern;

public class Phone {

	private String OS;
	private 	int Model;
	private String name;
	private int price;
	
	public Phone(String oS, int model, String name, int price) {
		super();
		OS = oS;
		Model = model;
		this.name = name;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", Model=" + Model + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
