import java.util.Scanner;

public class Practice2{
    static boolean isEven(int num){
        if(num%2 == 0){
            return true;
            // System.out.println("The entered number is Even.");
        }
        else{
            return false;
            // System.out.println("The enterd number is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(isEven(n));
    }
}
