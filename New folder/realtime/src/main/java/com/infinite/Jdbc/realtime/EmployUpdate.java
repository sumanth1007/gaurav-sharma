package com.infinite.Jdbc.realtime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Employ employ=new Employ();
		EmployDAO dao=new EmployDAO();
			System.out.println("Enter the Employ no");
			employ.setEmpno(sc.nextInt());
			System.out.println("Enter the Name");
			employ.setName(sc.next());
			System.out.println("Enter the Department");
			employ.setDept(sc.next());
			System.out.println("Enter the designation");
			employ.setDesig(sc.next());
			System.out.println("Enter the basic");
			employ.setBasic(sc.nextInt());
			System.out.println(new EmployDAO().UpdateEmploy(employ));
	}
	}

