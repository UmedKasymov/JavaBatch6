package com.syntax.class24Abstract;

public abstract class File {

	/*
	 * Create a class File that will have the following behaviors: open, edit, close. 
	 * Edit and close are implemented method while open is an abstract. 
	 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific 
	 * implementation of open behaviour: Example: to open .java file we need notepad++ or 
	 * sublime text, to open .doc file we need Microsoft word to be installed etc
	 */
	void edit() {
		System.out.println("Edits files");
	}
	void close() {
		System.out.println("Closes files");
	}
	public abstract void open();
}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open .java file you will need notepad++ or sublime text!");
		
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open .doc file you will need Microsoft Office!");
		
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open .pdf file you will need Adobe Reader!");
		
	}
	
}
