package com.target.services.productApi.model.rest;

public class Product_brand {
	private String brand;
	 private String manufacturer_brand;
	 private String facet_id;


	 // Getter Methods 

	 public String getBrand() {
	  return brand;
	 }

	 public String getManufacturer_brand() {
	  return manufacturer_brand;
	 }

	 public String getFacet_id() {
	  return facet_id;
	 }

	 // Setter Methods 

	 public void setBrand(String brand) {
	  this.brand = brand;
	 }

	 public void setManufacturer_brand(String manufacturer_brand) {
	  this.manufacturer_brand = manufacturer_brand;
	 }

	 public void setFacet_id(String facet_id) {
	  this.facet_id = facet_id;
	 }

}
