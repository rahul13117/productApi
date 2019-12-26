package com.target.services.productApi.model.rest;

public class Product_classification {
	private String product_type;
	 private String product_type_name;
	 private String item_type_name;
	 Item_type Item_typeObject;


	 // Getter Methods 

	 public String getProduct_type() {
	  return product_type;
	 }

	 public String getProduct_type_name() {
	  return product_type_name;
	 }

	 public String getItem_type_name() {
	  return item_type_name;
	 }

	 public Item_type getItem_type() {
	  return Item_typeObject;
	 }

	 // Setter Methods 

	 public void setProduct_type(String product_type) {
	  this.product_type = product_type;
	 }

	 public void setProduct_type_name(String product_type_name) {
	  this.product_type_name = product_type_name;
	 }

	 public void setItem_type_name(String item_type_name) {
	  this.item_type_name = item_type_name;
	 }

	 public void setItem_type(Item_type item_typeObject) {
	  this.Item_typeObject = item_typeObject;
	 }

}
