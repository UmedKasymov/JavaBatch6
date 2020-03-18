package com.syntax.class11;

public class PacticeClass11 {

	public static void main(String[] args) {
		// 

		String[][] countries = { { "Canada", "USA" },
				{ "Mexico", "Brasil", "Uruguay", "Argentina" },
				{ "England", "Poland", "Italy", "France" },
				{ "China", "India", "Pakistan" },
				{ "Zaire", "South Africa", "Ghana", " Nigeria" } };
		int sum1 = 0;
		int sum2=0;
		for(int i=0; i<countries.length; i++) {
		for( int j=0; j<countries[i].length; j++){
		    
			System.out.print(countries[i][j] + " ");
		     sum1 +=1;
	}

	System.out.println(" ");
	
  }
System.out.println(" ");
System.out.println("Total countries stored :" + sum1);
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

System.out.println(" -------------------");
System.out.println("Advanced for loop");
for (String [] i:countries) {
	for (String j:i) {
		System.out.print(j+ " ");
		sum2+=1;
	}
	System.out.println(" ");
}
System.out.println("Total countries stored :" + sum2);
	
}
}





