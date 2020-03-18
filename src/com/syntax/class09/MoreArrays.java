package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//Note: arrays are fixed in size
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Umed";-->during run time java machine will give
		//java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(students[3]);
		
		
		//if we store less elements than we declared 
		//compiler will add default values.
		String[] inClassStudents=new String[5];
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tetteh";
		
		System.out.println(inClassStudents[2]);//compiler will add a "default" value-->null!
		//and for different data type=it will give you "0" default value.
		
	}

}
