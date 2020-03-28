package com.syntax.Assignments7;

public class Assignment113 {

	  /*Create a method with the following specs:  

		Returns:
		an integer
		Name:
		sumEvenToX
		Parameters:
		an integer called "x"
		Purpose:
		calculate the sum of the EVEN integers from 1 to x (including x)
		
		Examples:
		sumEvenToX(5) ==> 6
		sumEvenToX(8) ==> 20
	 * 
	 */
	
		  void sumEvenToX(int x){
		        int sum=0;
		        for(int i=0; i<=x; i+=2){
		         sum=sum+i;
		        }
		        System.out.println(sum);
		      }
		      public static void main(String[] args){
		        Assignment113 object=new Assignment113();
		        object.sumEvenToX(5);
		        object.sumEvenToX(8);
		        
		      }
}
