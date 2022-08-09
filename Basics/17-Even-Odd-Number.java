import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be printed : ");
        int num = sc.nextInt();

        // Odd numbers
        System.out.println("Odd numbers are : ");
        for (int i=0; i<num; i++){
            System.out.println(2*i+1);
        }

        // Even number
        System.out.println("Even numbers are : ");
        for (int i=0; i<num; i++){
            System.out.println(2*i);
        }
    }
}
