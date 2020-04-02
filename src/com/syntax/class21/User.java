package com.syntax.class21;

public class User {//Task One

	/*
	 * Write program: userClass that has a constructor that initializes instance
	 * variable name and mobile number. Create a subclass userInfo that will have
	 * user address variable and it also being initialized through constructor call.
	 * Print users name, mobile number and address in userDetails method. Test your
	 * code.
	 * 
	 */
	
	  private String name;
	  private String mobileNumber;

	  public User(String name, String mobileNumber){
	    this.name = name;
	    this.mobileNumber = mobileNumber;
	  }

	  public String getUser(){
	     return this.name;
	  }
	  public void setUser(String name){
	     this.name = name;
	  }

	  public String getMobileNumber(){
	     return this.mobileNumber;
	  }

	  public void setMobileNumber(String mobileNumber){
	     this.mobileNumber = mobileNumber;
	  }

	  public String toString() { return "name: " + this.name +
	                             ", mobileNumber: " + this.mobileNumber; }
}
