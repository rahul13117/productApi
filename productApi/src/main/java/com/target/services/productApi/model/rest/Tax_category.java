package com.target.services.productApi.model.rest;

public class Tax_category {
	private String tax_class;
	private float tax_code_id;
	private String tax_code;

	// Getter Methods

	public String getTax_class() {
		return tax_class;
	}

	public float getTax_code_id() {
		return tax_code_id;
	}

	public String getTax_code() {
		return tax_code;
	}

	// Setter Methods

	public void setTax_class(String tax_class) {
		this.tax_class = tax_class;
	}

	public void setTax_code_id(float tax_code_id) {
		this.tax_code_id = tax_code_id;
	}

	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}
}
