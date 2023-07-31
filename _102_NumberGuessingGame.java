import java.util.*;
import java.util.Scanner;
public class _102_NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100+1);
        int userGuess = 0;
        System.out.println("The secret number is : "+ secretNumber);

        int guessCount = 1;
        final int maxAttempts = 5;
        Scanner sc = new Scanner(System.in);

        while(userGuess != secretNumber && guessCount <= maxAttempts){
            System.out.println("Enter Your guess number between 1 to 100 : ");
            userGuess = sc.nextInt();
            System.out.println(determineGuess(userGuess, secretNumber, guessCount));
            guessCount++;
        }

        if(userGuess != secretNumber){
            System.out.println("Sorry, you have reached the maximum number of attempts. ");
        }

        sc.close();
    }

    public static String determineGuess(int userGuess, int secretNumber,int guessCount){
        if(userGuess <= 0 || userGuess > 100)
            return "Your guess is invalid";
        else if (userGuess == secretNumber)
            return "Correct guess ! Total guesses made: "+ guessCount;
        else if (userGuess > secretNumber)
            return "Your guess is too high \n try again. \n Attempts Remaining : "+ (5-guessCount);
        else if(userGuess < secretNumber)
            return "Your guess is too low! \n try again. \n Attempts Remaining : "+ (5-guessCount);
        else
            return "Your guess is incorrect. \n try again. \n Attempts Remaining : "+ (5-guessCount);
    }
}
