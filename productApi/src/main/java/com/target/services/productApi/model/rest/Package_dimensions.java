package com.target.services.productApi.model.rest;
public class Package_dimensions {
	private String weight;
	 private String weight_unit_of_measure;
	 private String width;
	 private String depth;
	 private String height;
	 private String dimension_unit_of_measure;


	 // Getter Methods 

	 public String getWeight() {
	  return weight;
	 }

	 public String getWeight_unit_of_measure() {
	  return weight_unit_of_measure;
	 }

	 public String getWidth() {
	  return width;
	 }

	 public String getDepth() {
	  return depth;
	 }

	 public String getHeight() {
	  return height;
	 }

	 public String getDimension_unit_of_measure() {
	  return dimension_unit_of_measure;
	 }

	 // Setter Methods 

	 public void setWeight(String weight) {
	  this.weight = weight;
	 }

	 public void setWeight_unit_of_measure(String weight_unit_of_measure) {
	  this.weight_unit_of_measure = weight_unit_of_measure;
	 }

	 public void setWidth(String width) {
	  this.width = width;
	 }

	 public void setDepth(String depth) {
	  this.depth = depth;
	 }

	 public void setHeight(String height) {
	  this.height = height;
	 }

	 public void setDimension_unit_of_measure(String dimension_unit_of_measure) {
	  this.dimension_unit_of_measure = dimension_unit_of_measure;
	 }

}
