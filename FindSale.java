package com.java_lessons.newjdbc;
import java.util.Scanner;
public class FindSale {
	public static void main(String[] args) {
	     Sale item= null;
		SalesDAO prod=new SalesDAO();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter prod name");
		String pn=sc.nextLine();
		System.out.println(pn);
		item=prod.findsales(pn);
		if(item==null)
			System.out.println("product not found");
		else {
			System.out.print(item.getproductId());
		System.out.print("\t"+item.getproductName());
		System.out.println("\t"+item.getproductPrice());
		System.out.println("\t"+item.getproductQty());
		System.out.println("\t"+item.getproductdate());
	}
}
}