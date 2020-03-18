package com.syntax.class10;

public class MultiDimExample {

	public static void main(String[] args) {
		

		String[][]month= {
				{"January","February","December"},
				{"March","April","May"},
				{"June","July","August"},
				{"September","October","November"}
		};
		
		//System.out.println(month[2][2]);
		int rows=month.length;
		int firstArray=month[3].length;
		System.out.println(firstArray);
		
		for(int i=0; i<month.length; i++) {// outer loop//iterates over rows
			for(int j=0; j<month[i].length; j++) {//inner loop//iterates over columns
				System.out.print(month[i][j]+" : ");
			}
			System.out.println();
		}
	}
}

