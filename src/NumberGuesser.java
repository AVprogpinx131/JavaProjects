import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter a number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a number next time");
        }

        int userValidInput = scanner.nextByte();
        int randomNumber = random.nextInt(userValidInput);
        int countUserGuesses = 0;

        while(true){
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextByte();
            countUserGuesses++;

            if (userGuess == randomNumber) {
                System.out.println("You have guessed it!!");
                System.out.println("It took you " + countUserGuesses + " tries");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Guess higher");
            } else {
                System.out.println("Guess lower");
            }
        }

    }
}
