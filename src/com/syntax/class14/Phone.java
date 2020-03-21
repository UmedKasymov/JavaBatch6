package com.syntax.class14;

import java.util.Scanner;

public class Phone {
	//Create a Class “Phone”. Create 3 Objects of it: 
	//iPhone, Android, Nokia with specific  attributes and behaviors.
	
    String model;
    String color;
    String camera;

   public static void main(String[] args) {
	   
	Phone iPhone=new Phone();
	iPhone.model="iPhoneX";
	iPhone.color="Black";
	iPhone.camera="12 mp";
	
	iPhone.call();
	iPhone.text();
	iPhone.takePicture();
	
	Phone Android=new Phone();
	Android.model="Samsung S8";
	Android.color="White";
	Android.camera="10 mp";
	
	Android.call();
	Android.text();
	Android.takePicture();
	
	Phone Nokia=new Phone();
	Nokia.model="N97";
	Nokia.color="Grey";
	Nokia.camera="8 mp";
	
	Nokia.call();
	Nokia.text();
	Nokia.takePicture();
  }
  
  void call() {
      System.out.println(model+" able to call");//method
  }
  
  void text() {
      System.out.println(model+" able to text");
  }
  
  void takePicture() {
      System.out.println(model+" able to take pictures");
      
      String str="Hello Friends";
      str.replace("Hello", "Welcome");//replace is a method
      System.out.println(str);
      
      Scanner scan=new Scanner(System.in);
      scan.nextLine();
      
  }
}




