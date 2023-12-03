package com.ann.annsistem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ann.annsistem.exception.ProductNotFoundException;
import com.ann.annsistem.model.Product;
import com.ann.annsistem.repository.ProductRepository;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {
	
	private final ProductRepository repository;
	
	ProductController(ProductRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/teste")
	String teste() {
		return "rota funcionando";
	}
	
	@GetMapping("/products")
	List<Product> listProducts(){
		return repository.findAll();
	}
	
	@GetMapping("/products/{id}")
	Product getProduct(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	Product createProduct(@RequestBody Product newProduct) {
		return repository.save(newProduct);
	}
	
	@DeleteMapping("/products/{id}")
	@ResponseBody()
	String deleteProduct(@PathVariable Long id) {
		repository.deleteById(id);
		return "{\"response\":\"product deleted!\"}";
	}
	

}
