package com.syntax.class17;

public class Tasks010203 {

	protected int method1(int[] array) {
		int sum = 0;
		for(int i =0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
	protected String reverse(String given) {
		String reversed="";
		for(int i=given.length()-1; i>=0; i--) {
			reversed = reversed+given.charAt(i);
		}
		return reversed;
	}
	public static void main(String[] args) {
		int[] array= {43, 32, 12, 1,8,22};
		Tasks010203 obj = new Tasks010203();
		int sum1 = obj.method1(array);
		System.out.println(sum1);
		String str = obj.reverse("Hello world!");
		System.out.println(str);
	}
 }

