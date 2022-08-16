// Normal Fibonacci Series
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the term : ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i=0; i<num; i++){
            System.out.print(first + ", ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

// Recursion Method
import java.util.Scanner;

public class Practice2 {
    static int fib(int x){
        int first = 0;
        int second = 1;

        for (int i=0; i<x; i++){
            System.out.print(first + ", ");

            int next = first + second;
            first = second;
            second = next;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int sum = sc.nextInt();

        System.out.println("The Fibonacci Series is : ");
        System.out.println(fib(sum));
    }
}
