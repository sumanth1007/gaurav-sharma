package com.infinite.Jdbc.Stok;

public class test {
	public static void main(String[] args) {
		int j=0;
		String str="S001";
		String []part=str.split("(?<=\\D)(?=\\d)");
		String str2=part[1];
		 Integer s=Integer.parseInt(str2);
		for(int i=0;i<=3;i++){
			System.out.println(String.format("S%03d",s++));
		}
		}
		
	}


