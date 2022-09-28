package com.infinite.jdbcAgent;

import java.sql.SQLException;
import java.util.Scanner;


public class AddAgent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Agent agent=new Agent();
		System.out.println("Enter The name");
		agent.setName(sc.next());
		System.out.println("Enter The City");
		agent.setCity(sc.next());
		System.out.println("Enter The Gender");
		agent.setGender(sc.next());
		System.out.println("Enter The premium");
		agent.setPremium(sc.nextInt());
		AgentDao dao=new AgentDao();
		try {
			System.out.println(dao.addAgent(agent));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
