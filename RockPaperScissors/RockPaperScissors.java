⭐ ROCK PAPER SCISSORS GAME 

***************************************************************************************

import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){


        //ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        //GET A CHOICE FROM THE USER
        //GET RANDOM CHOICE FOR THE COMPUTER
        //CHECK WIN CONDITIONS
        //ASK TO PLAY AGAIN?
        //GOODBYE MESSAGE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.println("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(! playerChoice.equals("rock") && ! playerChoice.equals("paper") && ! playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
                System.out.println("You win!");
            }
            else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
                System.out.println("You win!");
            }
            else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You loose!");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();


        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");


        scanner.close();

    }
}

******************************************************************************************