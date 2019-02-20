package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
	private int saleId;
	private int prodCode;
	private String productName;
	private String cateogery;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	private String description;
	private int price;
	public Sale(int prodCode, int quantity, String cateogery, String productName, String productDescription,
			int price) {
		this.prodCode = prodCode;
		this.quantity = quantity;
		this.cateogery = cateogery;
		this.productName = productName;
		this.description = productDescription;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", prodCode=" + prodCode + ", productName=" + productName + ", cateogery="
				+ cateogery + ", saleDate=" + saleDate + ", quantity=" + quantity + ", lineTotal=" + lineTotal
				+ ", description=" + description + ", price=" + price + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCateogery() {
		return cateogery;
	}
	public void setCateogery(String cateogery) {
		this.cateogery = cateogery;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
}
