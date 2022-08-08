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
