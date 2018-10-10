
import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class GuessingGame {

    public static void main(String[] args){

        System.out.println("Welcome to my number Guessing Game");
     
        Random generator = new Random();
        int number = generator.nextInt(100)+1;
        int tries = 0; 
        
        Scanner input = new Scanner(System.in);
        int guess;
        int win = 0;

        while (win == 0){ 

            System.out.println("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            tries++; 

            if (guess == number){
                win = 1; 
                
            }

            else if(guess < number){
                System.out.println("Number is too low, try again");
   
            }

            else if(guess > number){
                System.out.println("Number is too high, try again");
            }
            
            if (guess == 0) {
                	System.out.println("Game Ended");
                	System.exit(0);
                }

        }

        System.out.println("You win!");
        System.out.println("It took you "+ tries + " tries.");

    }
}