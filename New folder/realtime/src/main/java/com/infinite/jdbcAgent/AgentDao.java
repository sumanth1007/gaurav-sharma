package com.infinite.jdbcAgent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infinite.Jdbc.realtime.ConnectionHelper;
import com.infinite.Jdbc.realtime.Employ;




public class AgentDao{
	Connection connection;
	PreparedStatement pst;
	
//Show Agents
	
	public List<Agent>showAgent() throws ClassNotFoundException, SQLException{
		List<Agent> agentlist=new ArrayList<Agent>();
		connection=ConnectionhelperAgent.getConnection();
		String cmd="select * from Agent";
		pst=connection.prepareStatement(cmd);
		ResultSet rs =pst.executeQuery();
		Agent agent=null;
		while(rs.next()) 
		{
			agent=new Agent();
			agent.setAgentid(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(rs.getString("gender"));
			agent.setPremium(rs.getInt("Premium"));
			agentlist.add(agent);
		}
		return agentlist;
	}

//Add Agent	
	
	public String addAgent(Agent agent) throws ClassNotFoundException, SQLException{
		connection=ConnectionhelperAgent.getConnection();
		String cmd="insert into Agent (Name,City,GENDER,MaritalStatus,Premium)"+ "value(?,?,?,'0',?)";
		pst=connection.prepareStatement(cmd);
		pst.setString(1,agent.getName());
		pst.setString(2,agent.getCity());
		pst.setString(3,agent.getGender());
		pst.setInt(4,agent.getPremium());
		pst.executeUpdate();
		return "Record Saved";
		
	}
	
//Search Agent	
	public Agent Searchagent(int AgentID) throws ClassNotFoundException, SQLException{
		connection=ConnectionhelperAgent.getConnection();
		String cmd="select * from Agent where AgentID=?";
		pst=connection.prepareStatement(cmd);
		System.out.println(AgentID);
		pst.setInt(1,AgentID );
		ResultSet rs =pst.executeQuery();
		Agent agents =null;
		if(rs.next()){
			agents=new Agent();
			agents.setAgentid(rs.getInt("agentid"));
			agents.setName(rs.getString("name"));
			agents.setCity(rs.getString("city"));
			agents.setGender(rs.getString("gender"));
			agents.setPremium(rs.getInt("Premium"));
		}
		return agents;
	}
	
//Agent Delete	
	public String DeleteAgent(int AgentID) throws SQLException, ClassNotFoundException{
		Agent agent = Searchagent(AgentID);
		connection=ConnectionhelperAgent.getConnection();
		String cmd="delete from Agent Where AgentID=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1,AgentID );
		pst.executeUpdate();
		return "Record Delete....";
		}
	//Update Agent
	public String UpdateAgent(Agent agentnew) throws ClassNotFoundException, SQLException{
		Agent agent = Searchagent(agentnew.getAgentid());
		connection=ConnectionhelperAgent.getConnection();
		String cmd="update Agent SET name=?,City=?,GENDER=?,"+"Premium=? where AgentID=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, agentnew.getName());
		pst.setString(2, agentnew.getCity());
		pst.setString(3, agentnew.getGender());
		pst.setInt(4, agentnew.getPremium());
		pst.setInt(5, agentnew.getAgentid());
		pst.executeUpdate();
		return "Record upadte";
	}
	
}