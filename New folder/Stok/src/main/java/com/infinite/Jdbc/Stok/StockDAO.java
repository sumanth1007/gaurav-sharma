package com.infinite.Jdbc.Stok;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class StockDAO {
	Connection connection;
	PreparedStatement pst;

//search stock
	public Stock SearchStock(String stockID) throws ClassNotFoundException, SQLException{
		connection= ConnectionHelperStock.getconnection();
		String cmd="select * from stock where StockID=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, stockID);
		ResultSet rs=pst.executeQuery();
		Stock stock=null;
		if(rs.next());{
			stock=new Stock();
			stock.setStockid(rs.getString("StockID"));
			stock.setItemName(rs.getString("itemname"));
			stock.setPrice(rs.getDouble("price"));
			stock.setQuantityAvail(rs.getInt("QuantityAvail"));
		
		}
		return stock;
	}
	
//Add Stock
	public 
	
		
	}
	
