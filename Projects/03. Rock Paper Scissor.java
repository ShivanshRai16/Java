import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper & Scissor game.");

        System.out.println("0 means Rock");
        System.out.println("1 means Paper");
        System.out.println("2 means Scissor");
        System.out.println("\nEnter your choice : ");

        int input = sc.nextInt();

        System.out.println("Your Choice : ");
        if (input == 0) {
            System.out.println("Rock");
        }
        else if (input == 1){
            System.out.println("Paper");
        }
        else if (input == 2){
            System.out.println("Scissor");
        }

        Random numgen = new Random();

        System.out.println("\nComputer Choice : ");
        int randomNumber = numgen.nextInt(3);
        System.out.println(randomNumber);

        if (randomNumber == 0) {
            System.out.println("Rock");
        }
        else if (randomNumber == 1){
            System.out.println("Paper");
        }
        else if (randomNumber == 2){
            System.out.println("Scissor");
        }

        System.out.println("\nResult : ");

        if (input == randomNumber) {
            System.out.println("Its a tie.");
        }
        else if (input == 0 && randomNumber == 1) {
            System.out.println("You Loss!");
            System.out.println("Paper cover Rock");
        }
        else if (input == 0 && randomNumber == 2) {
            System.out.println("You Won!");
            System.out.println("Rock break Scissor");
        }
        else if (input == 1 && randomNumber == 0) {
            System.out.println("You Won!");
            System.out.println("Paper Cover Rock");
        }
        else if (input == 1 && randomNumber == 2) {
            System.out.println("You Loss!");
            System.out.println("Scissor cuts Paper");
        }
        else if (input == 2 && randomNumber == 0) {
            System.out.println("You Loss!");
            System.out.println("Rock break Scissor");
        }
        else if (input == 2 && randomNumber == 1) {
            System.out.println("You Won!");
            System.out.println("Scissor cut Paper");
        }
        System.out.println("\n");
    }
}


// Another way to solve this problem.
import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors");
        }
    }
}
