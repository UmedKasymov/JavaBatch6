package com.syntax.class24Abstract;

public class FileTest {

	public static void main(String[] args) {
		
		File java=new JavaFile();
		java.edit();
		java.close();
		java.open();
		
		File word=new WordFile();
		word.edit();
		word.close();
		word.open();
		
		File pdf=new PDFFile();
		pdf.edit();
		pdf.close();
		pdf.open();
	}
}
