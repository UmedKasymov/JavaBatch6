package com.syntax.class19;

public class Book {

	/*
	 * Write program as a Book class that will have 2 Constructors. While creating
	 * an object make sure: Instance variables are being initialized Both
	 * Constructors are being executed
	 */
	
    String name;
    String author;
    int year;
    
     Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
     
     Book(String rating){
         this("Zero to One", "John Doe", 2020);
         System.out.println("You have to read this book to rate it");
         
     }
    
    public static void main(String[] args) {
        
        Book obj = new Book("B");
        
    }
}
