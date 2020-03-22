package com.syntax.class15;

public class Language {
	void lang(String word) {
        switch(word) {
        case "Russia":
            System.out.println("Privet");
            break;
        case "Turkey":
            System.out.println("Merhaba");
            break;
        case "Tajikistan":
            System.out.println("Salom");
            break;
        case "Mexico":
            System.out.println("Hola");
            break;
            default:
                System.out.println("wrong language");
        
        }
    }
    
    public static void main (String [] args) {
        
        Language obj = new Language();
        
        obj.lang("Russia");
        obj.lang("Turkey");
        obj.lang("Tajikistan");
        obj.lang("Mexico");
        
    }
}

