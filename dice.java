package test;
import java.util.Scanner;
import java.util.Random;

class Im {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args){
    	Random random = new Random();
    	String choice;
    	System.out.println("Would you like to roll the die?");
    	
    	
    	do {
    	int die_1 = random.nextInt(1, 7);
    	int die_2 = random.nextInt(1, 7);
    	System.out.printf("you rolled a %s and a %s. %n ", die_1, die_2);
    	System.out.println("Total: " + (die_1 + die_2));
    	System.out.println("Would you like to roll again? (y/n)");
    	choice = userinput.next();
    	} while (choice.equalsIgnoreCase("y"));
    	
    	System.out.println("Thank's for playing!");
        }
   }
