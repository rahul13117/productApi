package com.target.services.productApi.model.rest;

public class Return_policies {
	private String user;
	 private String policyDays;
	 private String guestMessage;


	 // Getter Methods 

	 public String getUser() {
	  return user;
	 }

	 public String getPolicyDays() {
	  return policyDays;
	 }

	 public String getGuestMessage() {
	  return guestMessage;
	 }

	 // Setter Methods 

	 public void setUser(String user) {
	  this.user = user;
	 }

	 public void setPolicyDays(String policyDays) {
	  this.policyDays = policyDays;
	 }

	 public void setGuestMessage(String guestMessage) {
	  this.guestMessage = guestMessage;
	 }

}
