package com.target.services.productApi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@RedisHash("ProductPrice")
public class ProductPrice {

    
	@Id private String productId;
    CurrentPrice currentPrice;
    
    public ProductPrice() {
    	
    }
    
    public ProductPrice(String productId, CurrentPrice currentPrice) {
    	
		this.productId = productId;
		this.currentPrice = currentPrice;
	}
    
    public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public CurrentPrice getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(CurrentPrice currentPrice) {
		this.currentPrice = currentPrice;
	}
	

    
   

}
