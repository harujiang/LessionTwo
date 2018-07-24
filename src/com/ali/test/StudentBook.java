package com.ali.test;

import javax.sql.rowset.CachedRowSet;
//test
public class StudentBook {
	private String bookName;
	private static byte b1=1,b2=2,b3,b6,b8,b7;  
	private static final byte b4=4,b5=6; 
	
	public void readBook(){
		
		 String bookName;
		System.out.println("i am reading:"+this.bookName);
	}
	public static void main(String[] args) {
	
		int i=10;
		//1111101000
		//01000
		byte a=(byte)i;
		System.out.println(a);
		
	}

}
