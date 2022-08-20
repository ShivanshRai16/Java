import java.util.Scanner;

public class Practice2{
    static int avg(int n1, int n2, int n3){
        int sum;
        sum = (n1 + n2 + n3) / 3;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Input the second number : ");
        int num2 = sc.nextInt();

        System.out.print("Input the third number : ");
        int num3 = sc.nextInt();

        System.out.print("The average value is : ");
        int sum = avg(num1, num2, num3);
        System.out.println(sum);
    }
}
