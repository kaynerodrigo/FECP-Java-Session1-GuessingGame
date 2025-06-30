import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNumber = (int)(Math.random()*5) + 1;
        System.out.println("I'm thinking of a number between 1 and 5.");


        for(int i=0; i<3; i++) {
            System.out.print("Guess " + (i+1) + ": ");
            int userGuess = sc.nextInt();
            if (userGuess != secretNumber) {
                System.out.println("Wrong guess.");
            }
            else {
                System.out.println("You guessed it!");
                System.out.println("You win!");
                return;
            }
        }
        System.out.println("You lose. The correct number was " + secretNumber + ".");


    }
}