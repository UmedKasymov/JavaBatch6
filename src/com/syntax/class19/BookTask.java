package com.syntax.class19;

public class BookTask {
		String book1, book2;
		BookTask(String str1, String str2){
			this();
			book1=str1;
			book2=str2;
			System.out.println(str1+str2);
		}
		BookTask() {
			System.out.println("I am reading a book");
		}
		public static void main(String[] args) {
			BookTask obj= new BookTask("I like this book, ", "I want to keep reading");
		}
	}

