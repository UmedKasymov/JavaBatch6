package com.syntax.class07;

public class WhilleLoop {

	public static void main(String[] args) {
		
		/*1.INITIALIZE A VARIABLE
		 * 
		 * WHILE(TEST VAR{
		 * 
		 * 
		 */
		  int time=10;
	        if(time>12){
	            System.out.println("Good morning");
	        }
	        System.out.println("------  WHILE LOOP ---------");
//	      while(time<12){
//	          System.out.println("Good morning");//CODE WILL EXECUTE INFINETELY
//	      }
	        while(time>12){
	            System.out.println("Good morning");
	            time++;
	        }
	        
	        //how to print numbers from 1 to 50?
	        
	        int num=1;
	        while(num<=50) {
	            System.out.println(num);
	            num++;
	        }
	        System.out.println("***************************");
	        // how to print numbers from 20 to 30
	        int num1=20;
	        while(num1<=30) {
	            System.out.println(num1);
	            num1++;
	        }
	        System.out.println("***************************");
	        // how to print number from 5 to 15 all in 1 line
	        int num2=5;
	        while(num2<=15) {
	            System.out.print(num2+" ");
	            num2++;
	        }
	        System.out.println("***************************");
	        // how to print values from 10 to 1?
	        int num3=10;
	        
	        while(num3>=1) {
	            System.out.println(num3);
	            num3--;    
	}
	        System.out.println("***************************");
	        //how to print from 50 to 1
	        //how to print odds number from 1 to 20
	        
	        int num4=50;
	        while(num4>=1) {
	        	System.out.println(num4);
	        	num4--;
	        }
	        System.out.println("***************************");
	        
	        int y=1;// First way1
	       
	        while(y<20) {
	        	System.out.println(y);
	        y+=2;
	        }
	        //Second way!
	        int x=1;
	        while(x<=20) {
	        	if(x%2!=0) {
	        		System.out.println(x);
	        	}
	        	x++;
	        }
	}
}
