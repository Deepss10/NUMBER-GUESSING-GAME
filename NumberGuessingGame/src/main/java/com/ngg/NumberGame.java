package com.ngg;
import java.util.Scanner;

public class NumberGame {
		
	
	public static void GuessingNumberGame() {
		
		    Scanner sc = new Scanner(System.in) ;
			int number = 1+(int)(100*Math.random());
			int K=5;
			int i,guess;	
			
			System.out.println("the number is chosen"
			                   +"between 1 to 100."
			                   +" Guess the number"
					           +" within 5 trials.");
			        
			         for(i=0; i<K; i++){
			        	 
			        	 System.out.println("Guess the number:");
			        	 
			        	 guess= sc.nextInt();
			    
			        	 if(number==guess) {
			        		 System.out.println("Congratulations!"
			        		 		+ "You have guessed the correct number");
			        	 break;
			        	 }	
			        	 else if(number>guess &&i!=K-1) {
			        		 System.out.println("the number is greater than"
			        		 		+ guess);
			         }
			        	 else if(number<guess &&i!=K-1){
			        		 System.out.println("the number is less than"
			        		 		+ guess);
			         }		
			
			         }
			         
			         if(i==K) {
			        	 System.out.println("You have exhausted"
			                              + "your K trails.");
			        	 System.out.println("The number was"+ number);
			         }
		}
		         		         
	public static void main(String arg[]) {
		GuessingNumberGame();
	}
		
	}