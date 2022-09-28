package com.infinite.jdbcAgent;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAgent {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Agentid");
		int AgentID=sc.nextInt();
		Agent agent;
		try {
			AgentDao dao=new AgentDao();
			agent = dao.Searchagent(AgentID);
			if(agent!=null){
				System.out.println(agent);
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


