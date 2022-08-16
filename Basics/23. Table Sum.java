import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to find the sum of table of : ");
        int tab = sc.nextInt();
        int sum = 0;
        int mul = 0;
        System.out.println("The table is : ");
        for (int i=1; i<=10; i++){
            mul = tab * i;
            System.out.printf("%d x %d = %d\n", tab, i, mul);
            sum = sum + (i * tab);
        }
        System.out.println("Sum of the above table is : ");
        System.out.println(sum);
    }
}
