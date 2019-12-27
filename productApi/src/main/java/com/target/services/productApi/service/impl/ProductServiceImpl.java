package com.target.services.productApi.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.services.productApi.model.CurrentPrice;
import com.target.services.productApi.model.Product;
import com.target.services.productApi.model.ProductPrice;
import com.target.services.productApi.repository.ProductRepository;
import com.target.services.productApi.service.ProductNameService;
import com.target.services.productApi.service.ProductService;

import io.netty.util.internal.StringUtil;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductNameService productNameService;

	@Autowired
	ProductRepository productRepository;

	/*
	 *  Get Product by Product Id 
	 */
	@Override
	public Product getProduct(String id) {
		Product product = new Product();
		product.setId(id);
		product.setCurrent_price(getProductPrice(id));
		product.setName(getProductName(id));

		return product;

	}

	/*
	 *  Get Product price from redis
	 */
	private CurrentPrice getProductPrice(String id) {

		Optional<ProductPrice> optCustomer = productRepository.findById(id);
		if (optCustomer.isPresent())
			return optCustomer.get().getCurrentPrice();
		else
			return null;

	}

	/*
	 * Get Product Name by Product Id from External API
	 */
	private String getProductName(String id) {

		String productName = productNameService.getProductName(id);
		if (!StringUtil.isNullOrEmpty(productName)) {
			return productName;
		}
		return null;
	}

	
	/*
	 *   If Product exist then  Update Product Price by Product Id into Redis(NoSql Data Store) 
	 */
	@Override
	public Product updateProductprice(String id, Product newProduct) {
		// TODO Auto-generated method stub

		Optional<ProductPrice> oldProductPrice = productRepository.findById(id);
		if (oldProductPrice.isPresent()) {
			oldProductPrice.get().setCurrentPrice(new CurrentPrice(newProduct.getCurrent_price().getValue(),
					newProduct.getCurrent_price().getCurrencyCode()));
			productRepository.save(oldProductPrice.get());
			newProduct.setCurrent_price(oldProductPrice.get().getCurrentPrice());
			return newProduct;
		}
		return newProduct;

	}
}
