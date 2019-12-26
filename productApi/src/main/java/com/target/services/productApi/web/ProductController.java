package com.target.services.productApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.services.productApi.model.Product;
import com.target.services.productApi.repository.ProductRepository;
import com.target.services.productApi.service.ProductService;

import io.netty.util.internal.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/v1")
@Api(value = "Product API Controller", tags = { "Product-api" })
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	ProductRepository repository;

	@GetMapping(value = "/product/{id}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	public ResponseEntity<Product> getProductInfo(@PathVariable("id") String productId) {
		Product product = productService.getProduct(productId);

		if (product.getCurrent_price() == null && StringUtil.isNullOrEmpty(product.getName())) {

			throw new ProductNotfoundException(productId);
		}

		return new ResponseEntity<>(product, HttpStatus.OK);

	}

	@PutMapping("/updateProdcut/{id}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Updated|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	public ResponseEntity<Product> updateProduct(@RequestBody Product newproductPrice,
			@PathVariable String id) {
 
		return new ResponseEntity<>(productService.updateProductprice(id,newproductPrice), HttpStatus.OK);
	}

}
