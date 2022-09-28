package com.infinite.Jdbc.realtime;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployShow {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Empno");
		int Empno=sc.nextInt();
		Employ employ;
		try {
			EmployDAO dao=new EmployDAO();
			employ = dao.SearchEmploy(Empno);
			if(employ!=null){
				System.out.println(employ);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	}


