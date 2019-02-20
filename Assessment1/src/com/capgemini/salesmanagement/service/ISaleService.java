package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;

public interface ISaleService {
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale) throws Exception;
	public boolean validateProductCode(int productId) throws Exception;
	boolean validateQuantity(int qty)throws Exception;
	public boolean validateProductCat(String prodCat) throws Exception;
	public boolean validateProductName(String prodName) throws Exception;
	public boolean validateProductPrice(float price) throws Exception;
}
