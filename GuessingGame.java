import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Scanner captures input
        Scanner input = new Scanner(System.in);
         // Create a Random object
        Random random = new Random();

         // Generate a random integer between 1 and 10
        int randomInt = random.nextInt(10) + 1;
        // chances variable keeps chance of how many attempts the user has left
        int chances = 3;

        // while chancres are greater than 0
        while (chances > 0) {
            // Ask user to enter integer between 1-10
            System.out.print("Enter an integer between 1-10: ");
            // number variable stores user int
            int number = input.nextInt();
            // if number and randomInt are equal user has won
            if (number == randomInt) {
                System.out.println("You win!");
                break;
            } 
            // if chances - 1 is greater than 0 subtract a chance and let  user know how many more they have
            else if (chances - 1 > 0) {
                chances--;
                System.out.println("That is not it, please try again. You now have " + chances + " more chances left.");
            } 
            // else user has run out of chances and the losing message is displayed
            else {
                System.out.println("All out of chances. You lose");
                break;
            }
        }

        input.close();
  }  
}
