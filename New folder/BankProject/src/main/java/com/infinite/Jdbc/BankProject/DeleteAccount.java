package com.infinite.Jdbc.BankProject;

import java.sql.SQLException;
import java.util.Scanner;



public class DeleteAccount {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Bank Account");
		int accountno=sc.nextInt();
		Bank bank;
		try {
			BankDAO dao=new BankDAO();
			System.out.println(dao.Accountdelete(accountno));
				System.out.println("Successfull....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
