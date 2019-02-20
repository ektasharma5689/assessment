package com.capgemini.salesmanagement.util;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {
	public static HashMap<Integer,Sale> sales = new HashMap<>();
	public static HashMap<Integer, Sale> getCollections() {
		return sales;
	}
	public static int saleId = (int) ((int) 1000*Math.random());
	public static int get_SaleID() {
		return saleId;
	}
}
