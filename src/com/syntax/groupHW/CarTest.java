package com.syntax.groupHW;

public class CarTest {
	
	public static void main(String[] args) {
		Truck tr = new Truck(25000, "Black", 5000);
		System.out.println(tr.calculateSalePrice());
		Sedan sd = new Sedan(25000, "Green", 22);
		System.out.println(sd.calculateSalePrice());
	}
}

