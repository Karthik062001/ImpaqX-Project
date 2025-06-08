package builder.design.pattern;

public class PhoneBuilder {

	private String OS;
	private 	int Model;
	private String name;
	private int price;
	
	
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	public PhoneBuilder setModel(int model) {
		Model = model;
		return this;
	}
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public Phone getPhone()
	{
	    return new Phone(OS, Model,name,price);
	}
	
	
	
}
