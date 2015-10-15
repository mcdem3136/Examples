
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mcdem3136
 */
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get guesses
        Scanner input = new Scanner(System.in);

        //create a random number from 1 to 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        //guess a number
        while (true) {
            System.out.println("Guess a number between 1 and 100");
            int guess = input.nextInt();
            //you're an idiot loop
            while(guess < 1 || guess > 100){
                System.out.println("No, idiot. Between ONE and ONE HUNDRED.");
                guess = input.nextInt();
            }

            //check the guess
            if (guess == randomNumber) {
                System.out.println("You win..jackass.");
                break;
            }else if(guess > randomNumber){
                System.out.println("Too high, idiot!");
            }else{
                System.out.println("Too low, idiot!");
            }
        }
    }
}
