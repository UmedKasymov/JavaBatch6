package com.syntax.Assignments3;

import java.util.Scanner;

public class Assignment42 {
		
		public static void main(String[] args){
			   Scanner input=new Scanner(System.in);
			   String student;
			   int rollNum;
			   System.out.print("enter the roll number of the Child");
			   
			   rollNum=input.nextInt();
			   
			   switch(rollNum){
			     
			     case 101:
			       student="Student name: Ramesh";
			       break;
			    case 102:
			      student="Student name: Mahesh";
			      break;
			    case 103:
			      student="Student name: Mukesh";
			      break;
			      default:
			      student="Not found Student name: in Class";
			      
			   }
			   System.out.println(student);
			   
			 }
		}


