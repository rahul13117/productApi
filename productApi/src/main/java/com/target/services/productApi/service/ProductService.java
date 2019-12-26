package com.target.services.productApi.service;

import com.target.services.productApi.model.Product;


public interface ProductService {
	
	public Product getProduct(String id);

	public Product updateProductprice(String id, Product newproductPrice);
	

}
