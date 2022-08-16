import java.util.Scanner;

public class Practice2 {
    static int multiplication(int x){
        int mul = 0;
        for (int i=0; i<=10; i++){
            mul = x * i;
            System.out.printf("%d X %d = %d\n", x, i, mul);
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be print its table : ");
        int num = sc.nextInt();

        int mul;
        System.out.printf("The table of %d is : \n", num);
        mul = multiplication(num);
        // multiplication(7); Direct call
    }
}
