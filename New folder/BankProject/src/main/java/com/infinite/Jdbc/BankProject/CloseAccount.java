package com.infinite.Jdbc.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

public class CloseAccount {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		int accountno;
		System.out.println("Enter the account number");
		accountno= sc.nextInt();
		BankDAO dao=new BankDAO();
		try {
			System.out.println(dao.closeaccount(accountno));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
