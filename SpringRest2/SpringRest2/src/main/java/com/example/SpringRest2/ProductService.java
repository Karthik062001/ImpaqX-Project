package com.example.SpringRest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	List<Product> product=new ArrayList( Arrays.asList(
			new Product(1,"Laptop",34000),
			new Product(2,"Mobile",24000),
			new Product(3,"Iphone",54593),
			new Product(4,"cloth",5600)));
	
	public List<Product> getProd() {
		return product;
	}

	public void addProduct(Product prod) {
		product.add(prod);
	}

	public void updateProduct(Product prod) {
		int index = 0;
		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getProId() == prod.getProId()) {
				index = i;
			}
		}
		product.set(index, prod);
	}

	public void deleteProduct(int id) {

		int index = 0;
		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getProId() == id) {
				index = i;
			}
		}
		product.remove(index);
	}
}
