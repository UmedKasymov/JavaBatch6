package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// Note: values stored inside arrays are "elements"
		//
		
		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		//what is average?
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		System.out.println("Average grade is "+average);
		//==================================================================
		System.out.println("----creating an array of cities------");
		
		String[] cities= {"Washinggton DC", "New York","Paris","Miami","Los Angeles",
				"Chantilly","Dallas"};
		//I live in Paris
		System.out.println("I live in "+cities[2]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to "+cities[x]);
		
		//How many elements stored inside the array?
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		
        //How can we access last element from an array?
		System.out.println(cities[arraySize-1]);// why "-1"?
		//NOTE:cause count of elements starts from 1 and count of arrays starts from 0-!
		
		//ACCES ALL ELEMENTS FROM AN ARRAY
		//cities[0],cities[1], cities[2],...=single array!
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}
	}

}
