package com.target.services.productApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.services.productApi.model.Product;
import com.target.services.productApi.service.ProductService;

import io.netty.util.internal.StringUtil;
import io.swagger.annotations.Api;


@RestController
@RequestMapping("/v1/products")
@Api(value = "Product API Controller", tags = {"Product-api"})
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Product> getProductInfo(@PathVariable("id") String productId){
		Product product = productService.getProduct(productId);
		
		  if(product.getCurrent_price() == null && StringUtil.isNullOrEmpty(product.getName())) {
		
			throw new ProductNotfoundException(productId);
		  }
		  System.out.println("2");
		return new ResponseEntity<>(productService.getProduct(productId), HttpStatus.OK);
	
	
	
//
//	@GetMapping(value = "/v1/products/{id}")
//	 @ApiOperation(value = "Get list of Students in the System ", response =
//	 Iterable.class, tags = "getProductInfo")
//	    @ApiResponses(value = { 
//	            @ApiResponse(code = 200, message = "Suceess|OK"),
//	            @ApiResponse(code = 401, message = "not authorized!"), 
//	            @ApiResponse(code = 403, message = "forbidden!!!"),
//	            @ApiResponse(code = 404, message = "not found!!!") })
//	public Optional<ProductName> getProductNameInfo(@PathVariable("id") Long id) {
//       test();
//		return productnameRepository.findById(id);
//	}
//
//	
//	public void test() {
//		
//		System.out.println(productNameService.getProductName(""));
//		
//		
//	}
	
}
}
