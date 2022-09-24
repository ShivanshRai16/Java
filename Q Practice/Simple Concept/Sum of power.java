import java.util.Scanner;

public class Practice4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sqr1 = 0;
        int sum = 0;

        for(int i=1; i<=num; i++){
            int sqr = i*i;
            System.out.print("The square of " + i + " is : ");
            System.out.println(sqr); 

            sum = sqr + sqr1;
            sqr1 = sum;
        }
        
        System.out.print("Enter the sum of the power is : ");
        System.out.println(sum);
    }
}
