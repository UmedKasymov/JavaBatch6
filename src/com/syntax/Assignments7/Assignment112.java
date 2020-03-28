package com.syntax.Assignments7;

public class Assignment112 {

	   /*Create a method that will accept 2 numbers as parameters and return true 
	   * if both numbers are even otherwise returned false
		( Return false if one or both given numbers are not even)
		
		Examples:
		bothEven(4,6) ==> true
		bothEven(3,4) ==> false
		bothEven(-1,1) ==> false
		
		Expected Output:
		false
	 * 
	 */
	 boolean compareEvenOdd(int x, int y) {
        if((x % 2 ==0) && ( y% 2==0)){
            System.out.println(true);
        } else
            System.out.println(false);
		return false;
	}
	public static void main(String[] args) {
		Assignment112 obj=new Assignment112();
		obj.compareEvenOdd(4, 6);
		obj.compareEvenOdd(3, 4);
		obj.compareEvenOdd(-1, 1);


		
	}
}
