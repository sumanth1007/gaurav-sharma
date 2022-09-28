package com.infinite.jdbcAgent;

import java.sql.SQLException;
import java.util.Scanner;

import com.infinite.Jdbc.realtime.EmployDAO;

public class AgentUpdate {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	Agent agent=new Agent();
	AgentDao dao=new AgentDao();
	System.out.println("Enter the Agent ID");
	agent.setAgentid(sc.nextInt());
	System.out.println("Enter the Name of Agent");
	agent.setName(sc.next());
	System.out.println("Enter the city of Agent");
	agent.setCity(sc.next());
	System.out.println("Enter the Gender of Agent");
	agent.setGender(sc.next());
	System.out.println("Enter the perimum of Agent");
	agent.setPremium(sc.nextInt());
	System.out.println(new AgentDao().UpdateAgent(agent));
}
}
