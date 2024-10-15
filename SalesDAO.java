package com.java_lessons.newjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.java_lessons.jdbc.Product;
import com.java_lessons.jdbc.ProductDAO;


public class SalesDAO {
    Sale product=new Sale();
	void addSales(Sale product) { 
		String productQty=product.getproductQty(); 
		int productPrice=product.getproductPrice();
		String date=product.getproductdate();
		String productName=product.getproductName();
		int productId=product.getproductId();
		PreparedStatement ps=null;
		Connection con=SalesDAO.getConnection();
		String sql="insert into sale values(?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, productId);
			ps.setString(2,productName);
			ps.setString(3, productQty);
			ps.setInt(4, productPrice);
			ps.setString(5, date);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	void updatesales(Sale item) {
		String productQty=product.getproductQty(); 
		String productName=product.getproductName();
		int productId=product.getproductId();
		PreparedStatement ps=null;
		Connection con=SalesDAO.getConnection();
		String sql="update sale set productName=? and productQty=? where product_id=?";
			try {
				ps=con.prepareStatement(sql);
				ps.setString(1,productName);
				ps.setString(2, productQty);
				ps.setInt(3, productId);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
	}
	void removesales(String ProdName) {
		String name=ProdName;
		Connection con =SalesDAO.getConnection();
	     PreparedStatement ps=null;
		
		
		
		String sql="delete from sale where productName=? ";

		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.executeUpdate();
			

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			}
	Sale findsales(String prodName) {
		Sale item= new Sale();
		Connection con =SalesDAO.getConnection();
	    PreparedStatement ps = null;
		String date;
		String product_name;
		int price=0;
		int id=0;
		String qty;
		String sql="select * from sale where productName=?";
		try {
			System.out.println("hi1");
			ps = con.prepareStatement(sql);
			ps.setString(1,prodName);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			System.out.println("hi2");
			if(rs==null)
				return null;
			while (rs.next())
			{
			id=rs.getInt(1);
			product_name=rs.getString(2);
			qty=rs.getString(3);
			price=rs.getInt(4);
			date=rs.getString(5);
			System.out.println("hi3");
			
			item.setproductdate(date);
			item.setproductId(id);
			item.setproductName(product_name);
			item.setproductQty(qty);
			item.setproductPrice(price);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return item ;
		
		}
	
	private static Connection getConnection() {
		String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
		String MYSQL_CONNECTION_URL=
			"jdbc:mysql://localhost:3306/shop";
		
			Connection con =null;
		    String strUserName="root";
		    String strPassword="root";
		    try {
		    	java.util.Properties p = new java.util.Properties();
				p.put("user",strUserName);
				p.put("password",strPassword);
				String driverName=MYSQL_DRIVERNAME;
				Class.forName(driverName);
				String url=MYSQL_CONNECTION_URL;
				con= DriverManager.getConnection(url,p);
				
				}
				 catch(SQLException err){
				    	System.out.println("Sql exception err."+err.getMessage());
				    }
				    catch (Exception err)
					 {
						System.out.println("Exception:  " + err.getMessage());
					 }
		    return con;
	

		
	}

}