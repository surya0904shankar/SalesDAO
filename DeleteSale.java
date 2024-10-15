package com.java_lessons.newjdbc;

import java.util.Scanner;


public class DeleteSale {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product name");
		String pn=sc.nextLine();
		SalesDAO item=new SalesDAO();
		item.removesales(pn);
	}

}
