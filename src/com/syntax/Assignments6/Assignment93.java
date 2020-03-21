package com.syntax.Assignments6;

import java.util.Scanner;

public class Assignment93 {

	public static void main(String[] args) {
		/*
		 * You have Scanner class to input string value.
		 * 
		 * If language is Java it should print the: "Java is a programming language".
		 * 
		 * If language is C it should print the:
		 * "C is a procedural programming language"
		 * 
		 * If language is C++ it should print the:
		 * "C++ is a middle-level programming language"
		 * 
		 * If any other should print: "Doesn't match any programming language"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = sc.nextLine();

		String[] lang = { "Java is a programming language", "C is a procedural programming language",
				"C++ is a middle-level programming language", "Doesnt match any programming language" };

		if (language.equalsIgnoreCase("Java")) {
			System.out.println(lang[0]);
		}else if (language.equalsIgnoreCase("C")) {
				System.out.println(lang[1]);
		}else if (language.equalsIgnoreCase("C++")) {
					System.out.println(lang[2]);

				} else {
					System.out.println(lang[3]);
				}
			}
		}

