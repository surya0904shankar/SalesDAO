package com.java_lessons.newjdbc;
import java.util.Scanner;
public class AddSale {
    public static void main(String[] args) {
		Sale product=new Sale();
		SalesDAO item =new SalesDAO();
		Scanner sc =new Scanner(System.in);	
		 System.out.println("enter product id");
		    int productId=sc.nextInt();
		    product.setproductId(productId);
		    sc.nextLine();
	    System.out.println("enter product name");
		String productName=sc.nextLine();
		product.setproductName(productName);
		System.out.println("enter product quantity");
		String productQty=sc.nextLine(); 
		product.setproductQty(productQty);
		System.out.println("enter product price");
		int productPrices=sc.nextInt();
		sc.nextLine();
		product.setproductPrice(productPrices);
		System.out.println("enter product date");
		String date=sc.nextLine();
		product.setproductdate(date);
		item.addSales(product);
		System.out.println("success");
		}
}
