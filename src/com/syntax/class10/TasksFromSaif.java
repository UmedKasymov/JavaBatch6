package com.syntax.class10;

public class TasksFromSaif {

	public static void main(String[] args) {
		System.out.println("====Task-1===============");
		String[] animalNames= {"Tiger","Lion", "Elephant", "Jaguar"};
		System.out.println("==1st for loops===========");
		for (String name: animalNames) {
			System.out.println(name+" ");
		}
		System.out.println("====2nd for loops============");
		for(int row=0;row<animalNames.length;row++) {
			System.out.print(animalNames[row]+", ");
		}
		System.out.println();
		System.out.println("======Task-2===================");
		//Create an array on integers and 
		//calculate the sum of all integer elements in an array.
		int[] num= {10, 20, 30, 40, 50, 60,70};
		int sum=0;
		for(int i:num) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("======Task-3===================");
		//Create an array of countries. 
		//While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).
		String[] countries= {"Bangladesh", "USA", "India", "Pakistan"};
		String capital = null;
		System.out.println("===1st Loop=====================");
		for(String name: countries) {
			if(name.equals("Bangladesh")) {
				capital="Dhaka";
			}else if(name.equals("USA")) {
				capital="Washington DC";
			}else if(name.equals("India")) {
				capital="New Delhi";
			}else if(name.equals("Pakistan")) {
				capital="Islamabad";
			}else {
				capital="unknown";
			}
			System.out.println("The capital of "+name+" is "+capital+" ." );
		}
		System.out.println("===2nd Loop=====================");
		for(int i=0;i<countries.length;i++) {
			if(countries[i].equals("Bangladesh")) {
				capital="Dhaka";
			}else if(countries[i].equals("USA")) {
				capital="Washington DC";
			}else if(countries[i].equals("India")) {
				capital="New Delhi";
			}else if(countries[i].equals("Pakistan")) {
				countries[i]="Islamabad";
			}else {
				capital="unknown";
			}
			System.out.println("The capital of "+countries[i]+" is "+capital+" ." );


	}
	}
}
