package com.capgemini.salesmanagement.ui;

import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {
		public static void main(String args[]) throws Exception {
			try
			{Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product code-");
			int prodCode = sc.nextInt();
			System.out.println("Enter Product quantity-");
			int quantity = sc.nextInt();
			System.out.println("Cateogery");
			String cateogery = sc.next();
			System.out.println("Product Name");
			String productName = sc.next();
			System.out.println("Product Description");
			String productDescription = sc.next();
			System.out.println("Product Price");
			int price = sc.nextInt();
			Sale sale = new Sale(prodCode,quantity,cateogery,productName,productDescription,price);
			ISaleService service = new SaleService();
			System.out.println(service.insertSalesDetails(sale));}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			

			
			
		}
}
