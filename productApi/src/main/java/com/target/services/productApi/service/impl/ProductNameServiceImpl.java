package com.target.services.productApi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.target.services.productApi.model.rest.ExternalApiProductName;
import com.target.services.productApi.service.ProductNameService;



@Service
public class ProductNameServiceImpl implements ProductNameService{

	
	 @Autowired
	  RestTemplate restTemplate;
	 
	 @Value("${baseurl}")
	 String baseUrl;
	 
	 @Value("${queryparams}")
	 String queryparams;
	 
	@Override
	// JSON Node for more Reablility 
	
	public String getProductName(String id) {
		// TODO Auto-generated method stub
		try {
			final String uri = baseUrl+id+queryparams;
			ExternalApiProductName result = restTemplate.getForObject(uri, ExternalApiProductName.class);
		     
		    
			return result.getProduct().getItem().getProduct_description().getTitle();
		} catch (Exception e) {
			return "";
		}
		
		
	}

}
