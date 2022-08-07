import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("else-if condition.");
        if (age>56){
            System.out.println("Your are experianced.");
        }
        else if (age>46){
            System.out.println("You are semi experianced.");
        }
        else if (age>36){
            System.out.println("You are little bit experianced.");
        }
        else{
            System.out.println("You are not experianced.");
        }

        System.out.println("Switch condition");
        switch(age){
            case 18:
            System.out.println("You are going to become adult.");
            break;

            case 23:
            System.out.println("You are about to join Job.");
            break;

            case 60:
            System.out.println("You are about to get retired.");
            break;

            default:
            System.out.println("Enjoy your life!");
        }
        System.out.println("Thanx for using this code.");
    }
}
