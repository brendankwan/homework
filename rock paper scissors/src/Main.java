import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int response = (int) ((Math.random() * 3) + 1);
        boolean ingame = true;
        int playerwins = 0;
        int computerwins = 0;

        //loop the game
        while (ingame) {
            //rules and instructions
            System.out.println("Rock Paper Scissor Game.");
            System.out.println("Game Logic:");
            System.out.println("- Rock beats Scissor.");
            System.out.println("- Scissors beats Paper.");
            System.out.println("- Paper beats Rock.");
            System.out.println("1 stands for rock.");
            System.out.println("2 stands for paper.");
            System.out.println("3 stands for scissors.");
            System.out.println("Type in digit 1, 2 or 3 to start game.");
            System.out.println("Type e after you finished a round to quit or start again by typing 1,2 or 3.");
            //scoreboard
            System.out.println("Your wins:" + playerwins);
            System.out.println("Computer wins:" + computerwins);
            //player pick rock paper or scissor
            int playerChoice = input.nextInt();
            //Computer responds
            System.out.println(response);

            //player picks rock and computer picks rock
            if ((playerChoice == rock) && (response == rock)) {
                System.out.println("Player chose rock.");
                System.out.println("Computer chose rock.");
                System.out.println("Tie game!");
                response = (int) ((Math.random() * 3) + 1);

            }
            //player picks rock and computer picks paper
            if ((playerChoice == rock) && (response == paper)) {

                System.out.println("Player chose rock.");
                System.out.println("Computer chose paper.");
                System.out.println("You lose!");
                computerwins ++;
                response = (int) ((Math.random() * 3) + 1);
            }
            //player picks rock and computer picks scissor
            if ((playerChoice == rock) && (response == scissors)) {

                System.out.println("Player chose rock.");
                System.out.println("Computer chose scissor.");
                System.out.println("You win!");
                playerwins ++ ;
                response = (int) ((Math.random() * 3) + 1);
            }
            //player picks paper and computer picks paper
            if ((playerChoice == paper) && (response == paper)) {

                System.out.println("Player chose paper.");
                System.out.println("Computer chose paper.");
                System.out.println("Tie game!");
                response = (int) ((Math.random() * 3) + 1);

            }
            //player picks paper and computer picks rock
            if ((playerChoice == paper) && (response == rock)) {

                System.out.println("Player chose paper.");
                System.out.println("Computer chose rock.");
                System.out.println("You win!");
                playerwins ++;
                response = (int) ((Math.random() * 3) + 1);
            }
            //player picks paper and computer picks scissor
            if ((playerChoice == paper) && (response == scissors)) {

                System.out.println("Player chose paper.");
                System.out.println("Computer chose scissor.");
                System.out.println("You lose!");
                computerwins ++;
                response = (int) ((Math.random() * 3) + 1);
            }
            //player picks scissors and computer picks scissors
            if ((playerChoice == scissors) && (response == scissors)) {

                System.out.println("Player chose paper.");
                System.out.println("Computer chose paper.");
                System.out.println("Tie game!");
                response = (int) ((Math.random() * 3) + 1);

            }
            //player picks scissor and computer picks paper
            if ((playerChoice == scissors) && (response == paper)) {

                System.out.println("Player chose scissor.");
                System.out.println("Computer chose paper.");
                System.out.println("You win!");
                playerwins ++ ;
                response = (int) ((Math.random() * 3) + 1);

            } //player picks scissors and computer picks rock
            if ((playerChoice == scissors) && (response == rock)) {

                System.out.println("Player chose scissor.");
                System.out.println("Computer chose rock.");
                System.out.println("You lost!");
                computerwins ++;
                response = (int) ((Math.random() * 3) + 1);

            }
            //player's response to quit
            String answer = input.next();
            if (answer.equals("e")){
                ingame = false;
                System.out.println("Thank you for playing!");
            }
            //if player type anything not told
            else{
                System.out.println("Not a proper command, please restart the game.");

            }


        }
    }
}



