package GeneralCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

   class zadanie{
	
	String url = "jdbc:mysql://localhost:3306/javaee?user=root&password=666666";
	String dr = "com.mysql.jdbc.Driver";
	String q1 = "SELECT * FROM products";
	String q2 = "SELECT ORDER_NUM, AMOUNT, COMPANY, CREDIT_LIMIT "
			+ "FROM ORDERS, CUSTOMERS WHERE CUST= CUST_NUM";
	public String COMPANY = new String();
	 void Connect (){
	try {
		Class.forName(dr);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try (Connection con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q2)){
		while (rs.next()){
		int OrderNum = rs.getInt("ORDER_NUM");
		 COMPANY = rs.getString("COMPANY");
		System.out.println("OrderNum =" + OrderNum + " "+
			"COMPANY =" + COMPANY);
			  		}
		//System.out.println(MFR_id);
		}catch(SQLException e){
		e.printStackTrace();
		}
	} 
}

public class general {

	public static void main(String[] args) {
        zadanie d = new zadanie();
		d.Connect();
		
	}
	}
				
		
						
				
				
				