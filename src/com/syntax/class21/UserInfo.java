package com.syntax.class21;

public class UserInfo{
	
	 private String address;
	 private String name;
	 
	 public UserInfo(String address){
		    this.address = address;
		    
}
	 public String getAddress(){
	     return this.address;
	  }
	  public void setAddress(String address){
	     this.address = address;
	  }
}