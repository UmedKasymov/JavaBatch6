package com.syntax.class25AbstractInterface;

interface CreditUnion{
	
	void giveCredit();
}
class Finance{
	public void financing() {
		System.out.println("Dealing with financing");
	}
	
}

public interface Trustable {

	//by default compiler will make method to be public and abstract
	void trust();
}
interface Bank extends Trustable{
	//by default compiler will make method to be public and abstract
	void deposit();
	void withdraw();
	
}
//first extends then implement
class BOA extends Finance implements Bank, CreditUnion{

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
		
	}

	@Override
	public void deposit() {
		System.out.println("You can make a deposit at BOA");
		
	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw your money at BOA");
	}
	public void giveCredit() {
		System.out.println("BOA gives credit");
	}
}






