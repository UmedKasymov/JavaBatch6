package com.syntax.Assignments5;

public class Assignment85 {

	public static void main(String[] args) {
		/*For you to do:
		Write a program that sums all numbers that are on even index and on even row.
		
		Expected Output:
		-4
		 * 
		 */
		int[][] a = {/////0  1 2  3
						{-5,-2,-3,7},//row
						{1,-5,-2,2},
						{1,-2,3,-4}
			};
	
		int sum=0;
        for (int i=0;i<a.length;i+=1){
            for (int j=0;j<a[i].length;j++)
                if(i%2==0 && j%2==0) {
                    sum=sum+a[i][j];
                }
        }
        System.out.println(sum);
        
	}
}