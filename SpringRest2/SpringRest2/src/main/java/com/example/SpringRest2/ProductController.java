package com.example.SpringRest2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> getAll() {
	    return service.getProd();
	   
	}

//	request param
//	http://localhost:8080/product?id=1&name=Laptop
//	@GetMapping
//	public Optional<Product> getProduct(@RequestParam int id,@RequestParam String name) {
//		return service.getProd().stream().filter(p -> p.getProId() == id).findFirst();
//	}
	
	@GetMapping("{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return service.getProd().stream().filter(p -> p.getProId() == id).findFirst();
	}

	@PostMapping
	public void addProd(@RequestBody Product pro) {
		service.addProduct(pro);
	}
	
	@PutMapping
	public void updateProd(@RequestBody Product pro)
	{
		service.updateProduct(pro);
	}
	
	
	@DeleteMapping("{id}")
	public void deleteProd(@PathVariable int id)
	{
		service.deleteProduct(id);
		
	}
}
