package com.target.services.productApi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.target.services.productApi.model.CurrentPrice;
import com.target.services.productApi.model.ProductPrice;
import com.target.services.productApi.repository.ProductRepository;
import com.target.services.productApi.service.ProductNameService;
import com.target.services.productApi.service.impl.ProductNameServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApiApplicationTests {

	@Autowired
	ProductRepository repository;
	
	@Mock
	ProductNameService productNameService = new ProductNameServiceImpl();
	
	@Test
	public void testRedis() {
		ProductPrice productPrice = repository.findById("1").get();
		ProductPrice expected = getProductPrice();
		assertEquals(expected.getCurrentPrice().getCurrencyCode(), productPrice.getCurrentPrice().getCurrencyCode());
		
	}
	
	@Test
	public void testExternalAp() {
		when(productNameService.getProductName("1")).thenReturn("any string");
	}
	
	private ProductPrice getProductPrice() {
		return new ProductPrice("1" , new CurrentPrice(14.23,"USD"));
		
	}

}
