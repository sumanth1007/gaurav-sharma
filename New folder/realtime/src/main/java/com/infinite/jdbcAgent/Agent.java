package com.infinite.jdbcAgent;

public class Agent {
	 private int Agentid;
	 private String name;
	 private String city;
	 private String gender;
	 private int premium;
	@Override
	public String toString() {
		return "Agent [Agentid=" + Agentid + ", name=" + name + ", city=" + city + ", gender=" + gender + ", premium="
				+ premium + "]";
	}
	public Agent(int agentid, String name, String city, String gender, int premium) {
		super();
		Agentid = agentid;
		this.name = name;
		this.city = city;
		this.gender = gender;
		this.premium = premium;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAgentid() {
		return Agentid;
	}
	public void setAgentid(int agentid) {
		Agentid = agentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	 
	 
	 

}
