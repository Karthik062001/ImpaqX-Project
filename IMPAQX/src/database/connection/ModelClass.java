package database.connection;

public class ModelClass implements Iphone {
	
	
	private int Model;
	private String name;
	private String OS;
	private int price;
	
	public ModelClass(int model, String name, String oS, int price) {
		super();
		Model = model;
		this.name = name;
		OS = oS;
		this.price = price;
	}

	

	public int getModel() {
		return Model;
	}


	public String getName() {
		return name;
	}


	public String getOS() {
		return OS;
	}


	public int getPrice() {
		return price;
	}



	@Override
	public String toString() {
		return "ModelClass [Model=" + Model + ", name=" + name + ", OS=" + OS + ", price=" + price + "]";
	}

	
}
