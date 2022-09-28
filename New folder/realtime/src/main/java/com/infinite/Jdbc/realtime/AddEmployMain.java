package com.infinite.Jdbc.realtime;

import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employ employ=new Employ();
		System.out.println("Enter The name");
		employ.setName(sc.next());
		System.out.println("Enter The Department");
		employ.setDept(sc.next());
		System.out.println("Enter The Designation");
		employ.setDesig(sc.next());
		System.out.println("Enter The Basic");
		employ.setBasic(sc.nextInt());
		EmployDAO dao=new EmployDAO();
		try {
			System.out.println(dao.addEmploy(employ));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
