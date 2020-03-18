package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		/*id student completed a quiz we will check for a score
		 * if score>90-->great job
		 * if score>80-->well done
		 * if score>70-->you could have done better
		 * if a student did not complete the quiz -->not good, please do homework on time
		 * 
		 */
		
		boolean quizCompleted=true;
		int score=46;
		
		if(quizCompleted) {
			System.out.println("Let's check your score");
			if(score>90) {
				System.out.println("Great job");
			}else if(score>80) { // Note: "else if" is used for checking same variables
				System.out.println("well done");//Note: "else if" check only for one "outcome"!
			}else if(score>70) {
				System.out.println("You could have done better");
			}else {
				System.out.println("You have failed Ilhom");
			}
		}else {
			System.out.println("Please do HW ontime");
		}
	}
	

}
