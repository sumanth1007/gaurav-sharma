package com.infinite.jdbcAgent;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentDelete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Agent id");
		int AgentID=sc.nextInt();
		Agent agent;
		try {
			AgentDao dao=new AgentDao();
			System.out.println(dao.DeleteAgent(AgentID));
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
