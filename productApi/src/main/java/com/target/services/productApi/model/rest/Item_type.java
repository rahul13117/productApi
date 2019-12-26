package com.target.services.productApi.model.rest;
public class Item_type {
	private String category_type;
	 private float type;
	 private String name;


	 // Getter Methods 

	 public String getCategory_type() {
	  return category_type;
	 }

	 public float getType() {
	  return type;
	 }

	 public String getName() {
	  return name;
	 }

	 // Setter Methods 

	 public void setCategory_type(String category_type) {
	  this.category_type = category_type;
	 }

	 public void setType(float type) {
	  this.type = type;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }
}
