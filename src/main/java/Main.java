import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){
        int guess = 0;
        int randNum = 0;
        boolean playAgain = true;
        int counter = 0;
        int repeatGuess = 0;
        Random rand = new Random();
        randNum = rand.nextInt(10);
        Scanner in = new Scanner(System.in);
        while(playAgain == true) {
            System.out.print("Guess the correct number! Enter a number: ");
            guess = in.nextInt();
            if(repeatGuess!=guess) {

                if (randNum < guess) {
                    System.out.print("Number is too small! ");
                    counter++;
                    repeatGuess = guess;
                } else if (randNum > guess) {
                    System.out.print("Number is too large! ");
                    counter++;
                    repeatGuess = guess;
                } else {
                    System.out.print("You guessed the number! ");
                    playAgain = false;
                }

            }
            else
            {
                System.out.print("You already guessed the number. Try again. ");
            }
        }
        System.out.print("You tried " + counter + " times before guessing correctly :D");
    }
}

