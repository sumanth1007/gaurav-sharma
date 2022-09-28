package com.infinite.Jdbc.Stok;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStock {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String stockID;
		System.out.println("Enter the StockID");
		stockID=sc.next();
		Stock stock;
		try {
			StockDAO dao=new StockDAO();
			stock=dao.SearchStock(stockID);
			if(stock!=null){
				System.out.println(stock);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
