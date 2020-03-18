package com.syntax.Assignments5;

public class Assignment69 {

	public static void main(String[] args) {
		  /*1 2 3 4 5 6 7 
			1 2 3 4 5 6 
			1 2 3 4 5 
			1 2 3 4 
			1 2 3 
			1 2 
			1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
			1 2 3 4 5 6 
			1 2 3 4 5 6 7
		 * 
		 */
		
			    for (int a = 7;  a>= 2; a--) {// rows
						for (int b = 1; b <= a; b++) {
							System.out.print(b + " ");
						}
						System.out.println();
					 
			    }
			    for (int r = 0; r <= 7; r++) {// rows
					for (int c = 1; c <= r; c++) {
						System.out.print(c + " ");
					}
					System.out.println();
			}
		}
	}






	
	