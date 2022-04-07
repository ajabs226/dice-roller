import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
    
		Scanner scnr = new Scanner(System.in);
        Random random = new Random();
        int rollOne = 0;
        int rollTwo = 0;
        int sides = 0;
        int roll = 1;
        String answer = "y";

        do {
        
        	System.out.println("How many sides should the pair of die have?");
            
        	try {

        		sides = scnr.nextInt();
                
        	} catch (InputMismatchException e) {

        		System.out.println("That is not a valid side.  Please try again.");
        		return;
            }

        	System.out.println();
        	System.out.println("Enter [1] to roll the die");

        	try {

        		roll = scnr.nextInt();

        	} catch (InputMismatchException e) {

        		System.out.println("That is not a valid roll.  Please try again.");

        	}

        	if (roll == 1 ) {

        		try {

        			System.out.println();
                    System.out.println("ROLLING...");
                    Thread.sleep(1500);

        		} catch (InterruptedException e) {

        			e.printStackTrace();

        		}

        		System.out.println();
        		System.out.println("Roll One");
        		System.out.println();

        		for (int i = 0; i < sides; i++) {

        			rollOne = random.nextInt(sides) + 1;
        			System.out.println(rollOne++);

        		}
        		
        		System.out.println();
        		System.out.println("ROLLING...");

        		try {
        			Thread.sleep(1500);

        		} catch (InterruptedException e) {

        			e.printStackTrace();

        		}

        		System.out.println();
        		System.out.println("Roll Two"); 
                System.out.println();

                for (int i = 0; i < sides; i++) {
                	rollTwo = random.nextInt(sides) + 1;
                	System.out.println(rollTwo++);

                }

                System.out.println();
                System.out.println("Do you want to play again? (y/n)");
                answer = scnr.next();
                System.out.println();
                continue;
                     } else {

                    	 do {               

                    		 System.out.println();
                    		 System.out.println("You did not enter a valid option.  Enter [1] to roll the die or [2] to exit");
                    		 roll = scnr.nextInt();

                    		 if (roll == 1) {

                    			 System.out.println("Great, let's continue!");
                    			 System.out.println();
                    			 break;
                    		 }else if (roll == 2) {

                    			 System.out.println();
                    			 System.out.println("You ended the game.  Goodbye!");
                    			 return;

                    		 }

                           } while(roll != 1 || roll !=2 || sides != scnr.nextInt());

                     }

        } while (answer.equalsIgnoreCase("y"));
       
	}                   

}