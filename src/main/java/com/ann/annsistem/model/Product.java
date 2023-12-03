package com.ann.annsistem.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

	private @Id @GeneratedValue Long id;
	private String name;
	private String category;
	private String price;
	private String urlImage;
	
	public Product() {}

	public Product(Long id, String name, String category, String price, String urlImage) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.urlImage = urlImage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price, urlImage);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(urlImage, other.urlImage);
	}
	
}
