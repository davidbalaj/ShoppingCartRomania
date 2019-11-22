package com.fdmgroup.models;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.finalproject.Product;

public class ProductModel {
	private List<Product> products;

	public ProductModel() {
		this.products = new ArrayList<Product>();
		this.products.add(new Product("p01", "Flag","Flag of Romania", "flag.png", 300));
		this.products.add(new Product("p02", "Hat", "Hat with Romania","hat.png", 1000));
		this.products.add(new Product("p03", "Mug", "Mug that says Romanian",  "mug.jpg", 3));
	}

	public List<Product> findAll() {
		return this.products;
	}

	public Product find(String id) {
		for (Product product : this.products) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}

}

