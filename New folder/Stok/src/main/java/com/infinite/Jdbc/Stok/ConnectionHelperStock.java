package com.infinite.Jdbc.Stok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionHelperStock {
	public static Connection getconnection() throws ClassNotFoundException, SQLException{
		 ResourceBundle rb=ResourceBundle.getBundle("db");
		 String driver=rb.getString("driver");
		 String url=rb.getString("url");
		 String user=rb.getString("user");
		 String pwd=rb.getString("password");
		 Class.forName(driver);
		 Connection connection=DriverManager.getConnection(url,user,pwd);
		 return connection;
		
	}

}
