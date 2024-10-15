package com.java_lessons.newjdbc;

import java.util.Scanner;

import com.java_lessons.jdbc.ProductDAO;

public class UpdateSale {

	public static void main(String[] args) {
		Sale product=new Sale();
		Scanner sc =new Scanner(System.in);	
		System.out.println("enter product id");
		    int productId=sc.nextInt();
		    product.setproductId(productId);
		    System.out.println("enter product name");
		    sc.nextLine();
		    
			String productName=sc.nextLine();
			product.setproductName(productName);
			System.out.println("enter product quantity");
			
			String productQty=sc.nextLine(); 
			product.setproductQty(productQty);
			SalesDAO item= new SalesDAO();
			item.updatesales(product);
	}

}
