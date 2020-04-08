package com.syntax.class24Abstract;

public abstract class Phone {

	//implemented methods
	public void call() {
		System.out.println("Phone can make a call");
	}
	public void text() {
		System.out.println("Phone can send text");
	}
	//UNimplemented methods=undefined methods=abstract methods
	public abstract void takePicture();
	//ABSTRACT: non access modifier that identifies smth is ...
	public abstract void playMusic();
}

class iPhone extends Phone{

	@Override
	public void takePicture() {
		System.out.println("iPhone takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("iPhone plays music using apple store");
		
	}
	
}

class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pitures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samasung plays music using google store");
		
	}
	
}
