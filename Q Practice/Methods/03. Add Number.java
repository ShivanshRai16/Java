import java.util.Scanner;

public class Practice2{
    static int add(int num1, int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int n2 = sc.nextInt();

        s = add(n1, n2);

        System.out.println("The sum is : ");
        System.out.println(s);
    }
}
