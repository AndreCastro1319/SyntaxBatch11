package com.syntax.class16;

public class Account {

	private String userName;
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance;
	
	public void setUserName(String AccountuserName) {
		if(AccountuserName.length()<16){
			userName=AccountuserName;
		}else {
			System.out.println("UserName of this length is not allowed");
		}
	}
	
	public void setPassword(String accountPass) {
		if(accountPass.length()<16) {
			password=accountPass;
		}else {
			System.out.println("password of this length is not allowed");
		}
	}
	
	public void getBalance(String AccountuserName,String accountPassword) {
		 if (userName.equals(AccountuserName)&& password.equals(accountPassword)) {
			 System.out.println(accountBalance);
		 }else {
			 System.out.println("UserName or password is not correct");
		 }
	}
}
