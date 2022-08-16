import java.util.Scanner;

// sum(n) = 1 + 2 + 3... + n
// sum(n) = 1 + 2 + 3... + n-1 + n
// sum(n) = sum(n-1) + n
// sum(3) = 3 + sum(2)
// sum(3) = 3 + 2 + sum(1)
// sum(3) = 3 + 2 + 1

public class Practice2 {
    static int sum(int x){
        if (x==1){ // Base Condition
            return 1;
        }
        else{
            return x + sum(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n term for sum : ");
        int sum = sc.nextInt();

        System.out.println("The sum is : " + sum(sum));
    }
}
