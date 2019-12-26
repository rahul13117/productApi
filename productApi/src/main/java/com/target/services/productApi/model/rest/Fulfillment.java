package com.target.services.productApi.model.rest;

public class Fulfillment {
	 private boolean is_po_box_prohibited;
	 private String po_box_prohibited_message;
	 private float box_percent_filled_by_volume;
	 private float box_percent_filled_by_weight;
	 private float box_percent_filled_display;


	 // Getter Methods 

	 public boolean getIs_po_box_prohibited() {
	  return is_po_box_prohibited;
	 }

	 public String getPo_box_prohibited_message() {
	  return po_box_prohibited_message;
	 }

	 public float getBox_percent_filled_by_volume() {
	  return box_percent_filled_by_volume;
	 }

	 public float getBox_percent_filled_by_weight() {
	  return box_percent_filled_by_weight;
	 }

	 public float getBox_percent_filled_display() {
	  return box_percent_filled_display;
	 }

	 // Setter Methods 

	 public void setIs_po_box_prohibited(boolean is_po_box_prohibited) {
	  this.is_po_box_prohibited = is_po_box_prohibited;
	 }

	 public void setPo_box_prohibited_message(String po_box_prohibited_message) {
	  this.po_box_prohibited_message = po_box_prohibited_message;
	 }

	 public void setBox_percent_filled_by_volume(float box_percent_filled_by_volume) {
	  this.box_percent_filled_by_volume = box_percent_filled_by_volume;
	 }

	 public void setBox_percent_filled_by_weight(float box_percent_filled_by_weight) {
	  this.box_percent_filled_by_weight = box_percent_filled_by_weight;
	 }

	 public void setBox_percent_filled_display(float box_percent_filled_display) {
	  this.box_percent_filled_display = box_percent_filled_display;
	 }
	}


