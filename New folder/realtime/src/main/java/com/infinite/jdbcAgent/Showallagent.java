package com.infinite.jdbcAgent;

import java.sql.SQLException;
import java.util.List;


public class Showallagent {
	public static void main(String[] args) {
		AgentDao dao=new AgentDao();
		try {
			List<Agent>agent=dao.showAgent();
			for (Agent agents : agent) {
				System.out.println(agents);
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
