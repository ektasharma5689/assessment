package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;

public interface IsaleDAO {
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale);
}
