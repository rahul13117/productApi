package com.target.services.productApi.model.rest;

public class Environmental_segmentation {
	private boolean is_hazardous_material;
	 private boolean has_lead_disclosure;


	 // Getter Methods 

	 public boolean getIs_hazardous_material() {
	  return is_hazardous_material;
	 }

	 public boolean getHas_lead_disclosure() {
	  return has_lead_disclosure;
	 }

	 // Setter Methods 

	 public void setIs_hazardous_material(boolean is_hazardous_material) {
	  this.is_hazardous_material = is_hazardous_material;
	 }

	 public void setHas_lead_disclosure(boolean has_lead_disclosure) {
	  this.has_lead_disclosure = has_lead_disclosure;
	 }

}
