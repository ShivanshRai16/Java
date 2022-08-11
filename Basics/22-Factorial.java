import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to find factorial : ");
        int num = sc.nextInt();

        System.out.println("Numbers are : ");
        int fac = 1;
        for (int i=1; i<=num; i++){
            System.out.println(i);
            fac = fac * i;
        }
        System.out.println("Factorial is : ");
        System.out.println(fac);
    }
}
