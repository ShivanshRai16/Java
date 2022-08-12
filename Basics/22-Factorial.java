import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to find factorial : ");
        int num = sc.nextInt();

        System.out.println("Numbers are : ");
        int fac = 1;
        
        // Using for loop
        for (int i=1; i<=num; i++){
            System.out.println(i);
            fac = fac * i;
        }
        System.out.println("Factorial is : ");
        System.out.println(fac);
        
        // Using while loop
        int i=1;
        while(i<=num){
            System.out.println(i);
            fac = fac * i;
            i++;
        }
        System.out.println("Factorial is : ");
        System.out.println(fac);
    }
}
