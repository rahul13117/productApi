package com.target.services.productApi.model;

public class CurrentPrice {
	
	private Double value;
	private String CurrencyCode;
	
	public CurrentPrice() {
		
	}
	
	public CurrentPrice(double value, String currencyCode) {
		this.value = value;
		CurrencyCode = currencyCode;
	}
	

	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	

}
