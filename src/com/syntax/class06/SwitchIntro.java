package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		int day=88;
		String dayName;
		
		if(day==1) {
			dayName="Monday";
			
		}else if(day==2) {
			dayName="Tuesday";
		}else if(day==3) {
			dayName="Wednesday";
		}else if(day==4) {
			dayName="Thursday";
		}else if(day==5) {
			dayName="Friday";
		}else if(day==6) {
			dayName="Saturday";
		}else if(day==7) {
			dayName="Sunday";
		}else {
		dayName="Invalid";
	}
System.out.println("Today is "+dayName);
System.out.println("------------------------------USING SWITCH------------------------");

      String today;
      switch(day) {//"with (Switch case) it's faster it right away jumps to a true value, knowing that 
                   //there isn't any other true value!
      case 1:
    	  today="Monday";
    	  break;//used to stop your execution! with no "break" it finds your value, but keeps going!
      case 2:
    	  today="Tuesday";
    	  break;
      case 3:
    	  today="Wednesday";
    	  break;
      case 4:
    	  today="Thursday";
    	  break;
      case 5:
    	  today="Friday";
    	  break;
      case 6:
    	  today="Saturday";
    	  break;
      case 7:
    	  today="Sunday";
    	  break;
      default://"Otherwise" like "else"!!!
    	  today="Invalid";
      }
      System.out.println("Today is "+today);
}
}
