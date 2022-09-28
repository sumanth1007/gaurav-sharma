package com.infinite.Jdbc.BankProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BankDAO {
	Connection connection;
	PreparedStatement pst;
	
	//Create The Account In bank
	public String createAccount(Bank bank) throws ClassNotFoundException, SQLException{
		int accountNo=generateAccountNo();
		bank.setAccountNo(accountNo);
		String cmd = "insert into Bank(AccountNo, FirstName, "
				+ "LastName, city,State,Amount, CheqFacil,"
				+ "AccountType) values(?,?,?,?,?,?,?,?)";
		connection = ConnectionhelperBP.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setInt(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccounType());
		pst.executeUpdate();
		return "Account Created...";
	}
	
	//Generate the account no.
	public int generateAccountNo() throws ClassNotFoundException, SQLException{
		connection=ConnectionhelperBP.getConnection();
		String cmd="select case when max(accountNo)is null then 1 else max(accountNo)+1 end accno from Bank";
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int accno=rs.getInt("accno");
		return accno;
	}
	
	//search account number
	
	public Bank SearchAccount(int accountno) throws ClassNotFoundException, SQLException{
		connection= ConnectionhelperBP.getConnection();
		String cmd="select * from Bank where AccountNo=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, accountno);
		ResultSet rs=pst.executeQuery();
		Bank bank=null;
			if(rs.next());{
				bank = new Bank();
				bank.setAccountNo(rs.getInt("accountNo"));
				bank.setFirstName(rs.getString("firstName"));
				bank.setLastName(rs.getString("lastName"));
				bank.setCity(rs.getString("city"));
				bank.setState(rs.getString("state"));
				bank.setAmount(rs.getInt("amount"));
				bank.setCheqFacil(rs.getString("cheqFacil"));
				bank.setAccounType(rs.getString("accountType"));
			}
			return bank;
		}
	// delete Account
	
	public String Accountdelete(int accountno) throws ClassNotFoundException, SQLException{
		Bank bank=SearchAccount(accountno);
		connection= ConnectionhelperBP.getConnection();
		String cmd="delete from Bank Where AccountNo =?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1,accountno);
		pst.executeUpdate();
		return "Record Delete....";
		}
	//Close account
		public String closeaccount(int account) throws ClassNotFoundException, SQLException{
			Bank bank=new Bank();
			if(bank!=null){
				String cmd="update  bank set status='inactive' where accountno=?";
				connection=ConnectionhelperBP.getConnection();
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, account);
				pst.executeUpdate();
				return "account closed,...,";
			}
			return "account Not found....";
		}
	//Deposit Amount
		public String depositAmount(int accountNo,double depositAmount) throws ClassNotFoundException, SQLException{
			Bank bank=SearchAccount(accountNo);
			if(bank!=null){
				connection=ConnectionhelperBP.getConnection();
				String cmd="update Bank set Amount=Amount+? where AccountNo=?";
				pst=connection.prepareStatement(cmd);
				pst.setDouble(1, depositAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd="insert into Trans(AccountNo,transAmount,TransType) values(?,?,?)";
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, depositAmount);
				pst.setString(3, "C");
				pst.executeUpdate();
				return "Amount Created....!";
				
			}
			
			return "Account Number Not Found.......!";
			
		}
		
		public String WithdrwAccount(int accountNo,double withdrawAmount) throws ClassNotFoundException, SQLException{
			Bank bank=SearchAccount(accountNo);
			if(bank!=null){
				double balance=bank.getAmount();
				if (balance-withdrawAmount>=1000){
					connection=ConnectionhelperBP.getConnection();
					String cmd="update Bank set Amount=Amount-? where AccountNo=?";
					pst=connection.prepareStatement(cmd);
					pst.setDouble(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd="insert into Trans(AccountNo,transAmount,TransType) values(?,?,?)";
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, accountNo);
					pst.setDouble(2, withdrawAmount);
					pst.setString(3, "D");
					pst.executeUpdate();
					
					return "Amount Debited....!";
				}else{
					return "Not enogh Balance";
				}
				
				
			}
			
			return "Account Number Not Found.......!";
		}
		
	
	}
		


