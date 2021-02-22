import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int score = 0;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int response = (int) ((Math.random() * 3)+1);
        int yes = 4;
        int no = 5;

        //System.out.println((int)(Math.random()*3)*1);
<<<<<<< HEAD

        String rock = "Rock";
        String paper = " Paper";
        String scissors = " Scissors";
        String intro = rock + paper + scissors + "?";
       
        System.out.println(intro);
=======
        System.out.println("Rock Paper Scissor Game.");
        System.out.println("Game Logic:");
        System.out.println("- Rock beats Scissor.");
        System.out.println("- Scissors beats Paper.");
        System.out.println("- Paper beats Rock.");
        System.out.println("1 stands for rock.");
        System.out.println("2 stands for paper.");
        System.out.println("3 stands for scissors.")   ;
        System.out.println("Type in digit 1, 2 or 3 to start game.");

        int playerChoice = input.nextInt();
        System.out.println(response);

        if ((playerChoice == rock) && (response == rock)) {
            System.out.println("Player chose rock.");
            System.out.println("Computer chose rock.");
            System.out.println("Tie game!");
            score = 0;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == rock) && (response == paper))  {

            System.out.println("Player chose rock.");
            System.out.println("Computer chose paper.");
            System.out.println("You lose!");
            score = 0;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == rock) && (response == scissors))  {

            System.out.println("Player chose rock.");
            System.out.println("Computer chose scissor.");
            System.out.println("You win!");
            score ++ ;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == paper) && (response == paper))  {

            System.out.println("Player chose paper.");
            System.out.println("Computer chose paper.");
            System.out.println("Tie game!");
            score = 0 ;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == paper) && (response == rock))  {

            System.out.println("Player chose paper.");
            System.out.println("Computer chose rock.");
            System.out.println("You win!");
            score ++ ;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == paper) && (response == scissors))  {

            System.out.println("Player chose paper.");
            System.out.println("Computer chose scissor.");
            System.out.println("You lose!");
            score = 0 ;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == scissors) && (response == scissors))  {

            System.out.println("Player chose paper.");
            System.out.println("Computer chose paper.");
            System.out.println("Tie game!");
            score = 0 ;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == scissors) && (response == paper))  {

            System.out.println("Player chose scissor.");
            System.out.println("Computer chose paper.");
            System.out.println("You win!");
            score = 0 ;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice == scissors) && (response == rock))  {

            System.out.println("Player chose scissor.");
            System.out.println("Computer chose rock.");
            System.out.println("You los!");
            score = 0 ;
            System.out.println("Wins: " + score);
        }
        if ((playerChoice < rock) || (playerChoice > scissors)) {
            System.out.println("Please enter 1 ,2 or 3 to start the game.");
        }
>>>>>>> 039cecdd116988cdafb02ed51666f4a822737557


        System.out.println("Do you wish to continue?");
        System.out.println("Type 4 for yes 5 for no.");
        int answer = input.nextInt();
        if (answer == yes) {
            System.out.println("Run this again!");
        }
        if (answer == no) {
            System.out.println("Thank you for playing!");
        }
    }
}
