package com.infinite.Jdbc.realtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDelete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Empno");
		int empno=sc.nextInt();
		Employ employ;
		try {
			EmployDAO dao=new EmployDAO();
			System.out.println(dao.DeleteEmploy(empno));
				System.out.println("Successfull....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}


	}
