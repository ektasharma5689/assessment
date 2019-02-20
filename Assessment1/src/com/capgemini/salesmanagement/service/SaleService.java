package com.capgemini.salesmanagement.service;

import java.time.LocalDate;
import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.IsaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;

public class SaleService implements ISaleService{

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) throws Exception {
		validateProductCode(sale.getProdCode());
		validateProductCat(sale.getCateogery());
		validateProductName(sale.getProductName());
		validateProductPrice(sale.getPrice());
		validateQuantity(sale.getQuantity());
		sale.setSaleDate(LocalDate.now());
		IsaleDAO serviceDao = new SaleDAO();
		sale.setLineTotal(calclateLineTotal(sale.getQuantity(),sale.getPrice()));
		return serviceDao.insertSalesDetails(sale);
	}

	private float calclateLineTotal(int quantity, int price) {
		float lineTotal = quantity*price;
		return lineTotal;
	}

	@Override
	public boolean validateProductCode(int productId) throws Exception {
		if(productId == 1001 || productId == 1002 || productId == 1003 || productId == 1004)
		return true;
		else throw new Exception();
	}

	@Override
	public boolean validateQuantity(int qty) throws Exception {
		if(qty>0 || qty<5)
		return true;
		else throw new Exception();
	}

	@Override
	public boolean validateProductCat(String prodCat) throws Exception {
		if(prodCat.equalsIgnoreCase("Electronics")|| prodCat.equalsIgnoreCase("Toys"))
		return true;
		else throw new Exception();
	}

	@Override
	public boolean validateProductName(String prodName) throws Exception {
		if(prodName.equalsIgnoreCase("TV")||prodName.equalsIgnoreCase("Smart Phone")||prodName.equalsIgnoreCase("Video Game")||prodName.equalsIgnoreCase("soft Toy")||prodName.equalsIgnoreCase("Telescope")||prodName.equalsIgnoreCase("Barbee Doll"))
		return true;
		else throw new Exception();
	}

	@Override
	public boolean validateProductPrice(float price) throws Exception {
		if(price>200)
		return true;
		else throw new Exception();
	}
	
}
