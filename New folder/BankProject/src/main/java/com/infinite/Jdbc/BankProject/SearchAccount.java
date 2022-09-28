package com.infinite.Jdbc.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccount {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Account No.");
			int accountno=sc.nextInt();
			Bank bank;
			 try {
				BankDAO dao=new BankDAO();
				 bank=dao.SearchAccount(accountno);
				 if(bank!=null){
					 System.out.println(bank);
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
}
