package com.target.services.productApi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.target.services.productApi.model.rest.ExternalApiProductName;
import com.target.services.productApi.service.ProductNameService;



@Service
public class ProductNameServiceImpl implements ProductNameService{

	
	 @Autowired
	    RestTemplate restTemplate;
	 
	@Override
	// JSON Node for more Reablility 
	
	public String getProductName(String id) {
		// TODO Auto-generated method stub
		final String uri = "https://redsky.target.com/v2/pdp/tcin/13860428?"
				+ "excludes=circle_offers,available_to_promise_network,deep_red_labels,"
				+ "rating_and_review_reviews,taxonomy,price,promotion,bulk_ship,rating_and_review_revie%20ws,"
				+ "rating_and_review_statistics,question_answer_statistics";
		ExternalApiProductName result = restTemplate.getForObject(uri, ExternalApiProductName.class);
	     
	    System.out.println(result.getProduct().getItem().getProduct_description().getTitle());
		return result.getProduct().getItem().getProduct_description().getTitle();
	}

}
