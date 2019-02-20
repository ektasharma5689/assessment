package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements IsaleDAO{

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		int saleId = CollectionUtil.get_SaleID();
		sale.setSaleId(saleId);
		CollectionUtil.sales.put(saleId, sale);
		return CollectionUtil.sales;
	}

}
