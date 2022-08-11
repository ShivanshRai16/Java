import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the to print that table : ");
        int num = sc.nextInt();

        System.out.println("Table is : ");
        for (int i=1; i<=10; i++){
            int mul = num * i;
            System.out.print(num); 
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(mul);
            // System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        
        System.out.println("Table in reverse order : ");
        for (int i=10; i>=0; i--){
            int mul = num * i;
            System.out.print(num); 
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(mul);
            // System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
}
