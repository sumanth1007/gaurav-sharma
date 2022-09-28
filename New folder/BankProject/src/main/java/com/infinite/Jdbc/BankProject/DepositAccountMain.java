package com.infinite.Jdbc.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in );
		int accountNo;
		double depositAmount;
		System.out.println("Enter the Account No. ");
		accountNo=sc.nextInt();
		System.out.println("Enter The Deposit Amount");
		depositAmount=sc.nextDouble();
		BankDAO dao=new BankDAO();
		try {
			System.out.println(dao.depositAmount(accountNo, depositAmount));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
