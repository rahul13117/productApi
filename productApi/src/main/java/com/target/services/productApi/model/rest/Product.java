package com.target.services.productApi.model.rest;

public class Product {
	
	Item ItemObject;
	 Circle_offers Circle_offersObject;


	 // Getter Methods 

	 public Item getItem() {
	  return ItemObject;
	 }

	 public Circle_offers getCircle_offers() {
	  return Circle_offersObject;
	 }

	 // Setter Methods 

	 public void setItem(Item itemObject) {
	  this.ItemObject = itemObject;
	 }

	 public void setCircle_offers(Circle_offers circle_offersObject) {
	  this.Circle_offersObject = circle_offersObject;
	 }

}
