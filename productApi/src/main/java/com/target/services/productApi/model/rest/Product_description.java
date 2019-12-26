package com.target.services.productApi.model.rest;

import java.util.ArrayList;

public class Product_description {
	private String title;
	 private String downstream_description;
	 ArrayList < Object > bullet_description = new ArrayList < Object > ();


	 // Getter Methods 

	 public String getTitle() {
	  return title;
	 }

	 public String getDownstream_description() {
	  return downstream_description;
	 }

	 // Setter Methods 

	 public void setTitle(String title) {
	  this.title = title;
	 }

	 public void setDownstream_description(String downstream_description) {
	  this.downstream_description = downstream_description;
	 }

}
