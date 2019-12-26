package com.target.services.productApi.model.rest;

import java.util.ArrayList;

public class Item {
	private String tcin;
	Bundle_components Bundle_componentsObject;
	private String dpci;
	private String upc;
	Product_description Product_descriptionObject;
	private String buy_url;
	Enrichment EnrichmentObject;
	private String return_method;
	Handling HandlingObject;
	Recall_compliance Recall_complianceObject;
	Tax_category Tax_categoryObject;
	Display_option Display_optionObject;
	Fulfillment FulfillmentObject;
	Package_dimensions Package_dimensionsObject;
	Environmental_segmentation Environmental_segmentationObject;
	Manufacturer ManufacturerObject;
	ArrayList<Object> product_vendors = new ArrayList<Object>();
	Product_classification Product_classificationObject;
	Product_brand Product_brandObject;
	private String item_state;
	ArrayList<Object> specifications = new ArrayList<Object>();
	Attributes AttributesObject;
	private String country_of_origin;
	private String relationship_type_code;
	private boolean subscription_eligible;
	ArrayList<Object> ribbons = new ArrayList<Object>();
	ArrayList<Object> tags = new ArrayList<Object>();
	private String ship_to_restriction;
	private String estore_item_status_code;
	private boolean is_proposition_65;
	Return_policies Return_policiesObject;
	private boolean gifting_enabled;
	Packaging PackagingObject;

	// Getter Methods

	public String getTcin() {
		return tcin;
	}

	public Bundle_components getBundle_components() {
		return Bundle_componentsObject;
	}

	public String getDpci() {
		return dpci;
	}

	public String getUpc() {
		return upc;
	}

	public Product_description getProduct_description() {
		return Product_descriptionObject;
	}

	public String getBuy_url() {
		return buy_url;
	}

	public Enrichment getEnrichment() {
		return EnrichmentObject;
	}

	public String getReturn_method() {
		return return_method;
	}

	public Handling getHandling() {
		return HandlingObject;
	}

	public Recall_compliance getRecall_compliance() {
		return Recall_complianceObject;
	}

	public Tax_category getTax_category() {
		return Tax_categoryObject;
	}

	public Display_option getDisplay_option() {
		return Display_optionObject;
	}

	public Fulfillment getFulfillment() {
		return FulfillmentObject;
	}

	public Package_dimensions getPackage_dimensions() {
		return Package_dimensionsObject;
	}

	public Environmental_segmentation getEnvironmental_segmentation() {
		return Environmental_segmentationObject;
	}

	public Manufacturer getManufacturer() {
		return ManufacturerObject;
	}

	public Product_classification getProduct_classification() {
		return Product_classificationObject;
	}

	public Product_brand getProduct_brand() {
		return Product_brandObject;
	}

	public String getItem_state() {
		return item_state;
	}

	public Attributes getAttributes() {
		return AttributesObject;
	}

	public String getCountry_of_origin() {
		return country_of_origin;
	}

	public String getRelationship_type_code() {
		return relationship_type_code;
	}

	public boolean getSubscription_eligible() {
		return subscription_eligible;
	}

	public String getShip_to_restriction() {
		return ship_to_restriction;
	}

	public String getEstore_item_status_code() {
		return estore_item_status_code;
	}

	public boolean getIs_proposition_65() {
		return is_proposition_65;
	}

	public Return_policies getReturn_policies() {
		return Return_policiesObject;
	}

	public boolean getGifting_enabled() {
		return gifting_enabled;
	}

	public Packaging getPackaging() {
		return PackagingObject;
	}

	// Setter Methods

	public void setTcin(String tcin) {
		this.tcin = tcin;
	}

	public void setBundle_components(Bundle_components bundle_componentsObject) {
		this.Bundle_componentsObject = bundle_componentsObject;
	}

	public void setDpci(String dpci) {
		this.dpci = dpci;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public void setProduct_description(Product_description product_descriptionObject) {
		this.Product_descriptionObject = product_descriptionObject;
	}

	public void setBuy_url(String buy_url) {
		this.buy_url = buy_url;
	}

	public void setEnrichment(Enrichment enrichmentObject) {
		this.EnrichmentObject = enrichmentObject;
	}

	public void setReturn_method(String return_method) {
		this.return_method = return_method;
	}

	public void setHandling(Handling handlingObject) {
		this.HandlingObject = handlingObject;
	}

	public void setRecall_compliance(Recall_compliance recall_complianceObject) {
		this.Recall_complianceObject = recall_complianceObject;
	}

	public void setTax_category(Tax_category tax_categoryObject) {
		this.Tax_categoryObject = tax_categoryObject;
	}

	public void setDisplay_option(Display_option display_optionObject) {
		this.Display_optionObject = display_optionObject;
	}

	public void setFulfillment(Fulfillment fulfillmentObject) {
		this.FulfillmentObject = fulfillmentObject;
	}

	public void setPackage_dimensions(Package_dimensions package_dimensionsObject) {
		this.Package_dimensionsObject = package_dimensionsObject;
	}

	public void setEnvironmental_segmentation(Environmental_segmentation environmental_segmentationObject) {
		this.Environmental_segmentationObject = environmental_segmentationObject;
	}

	public void setManufacturer(Manufacturer manufacturerObject) {
		this.ManufacturerObject = manufacturerObject;
	}

	public void setProduct_classification(Product_classification product_classificationObject) {
		this.Product_classificationObject = product_classificationObject;
	}

	public void setProduct_brand(Product_brand product_brandObject) {
		this.Product_brandObject = product_brandObject;
	}

	public void setItem_state(String item_state) {
		this.item_state = item_state;
	}

	public void setAttributes(Attributes attributesObject) {
		this.AttributesObject = attributesObject;
	}

	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}

	public void setRelationship_type_code(String relationship_type_code) {
		this.relationship_type_code = relationship_type_code;
	}

	public void setSubscription_eligible(boolean subscription_eligible) {
		this.subscription_eligible = subscription_eligible;
	}

	public void setShip_to_restriction(String ship_to_restriction) {
		this.ship_to_restriction = ship_to_restriction;
	}

	public void setEstore_item_status_code(String estore_item_status_code) {
		this.estore_item_status_code = estore_item_status_code;
	}

	public void setIs_proposition_65(boolean is_proposition_65) {
		this.is_proposition_65 = is_proposition_65;
	}

	public void setReturn_policies(Return_policies return_policiesObject) {
		this.Return_policiesObject = return_policiesObject;
	}

	public void setGifting_enabled(boolean gifting_enabled) {
		this.gifting_enabled = gifting_enabled;
	}

	public void setPackaging(Packaging packagingObject) {
		this.PackagingObject = packagingObject;
	}
}
