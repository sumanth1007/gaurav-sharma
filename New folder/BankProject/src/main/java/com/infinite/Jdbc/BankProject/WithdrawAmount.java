package com.infinite.Jdbc.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

public class WithdrawAmount {
	public static void main(String[] args) {
		int accountno;
		double withdrawamount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Account No.");
		accountno=sc.nextInt();
		System.out.println("Enter The WithdrawAmount");
		withdrawamount=sc.nextDouble();
		BankDAO dao=new BankDAO();
		
		try {
			
			System.out.println(dao.WithdrwAccount(accountno,withdrawamount));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	}
