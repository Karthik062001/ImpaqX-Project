package database.connection;

public class PhoneBiulder {

	private int Model;
	private String name;
	private String OS;
	private int price;
	
	public PhoneBiulder setModel(int model) {
		Model = model;
		return this;
	}
	public PhoneBiulder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBiulder setOS(String oS) {
		OS = oS;
		return this;
	}
	public PhoneBiulder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public  ModelClass phone()
	{
		return new ModelClass(Model, name,OS,price);
	}
	
	
}
