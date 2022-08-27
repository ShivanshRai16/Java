import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for sum : ");
        int num = sc.nextInt();

        // Sum of n natural number.
        System.out.println("Numbers are : ");
        int i=0;
        int sum = 0;
        while(i<=num){
            System.out.println(i);
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of the n number is : ");
        System.out.println(sum);
      
        // Sum of n even number.
        while(i<=num){
            System.out.println(i);
            sum = sum + i;
            i = i+2;
        }
        System.out.println("Sum of the n even number is : ");
        System.out.println(sum);
        
        // Using For loop
        for (int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("The sum is : ");
        System.out.println(sum);
    }
}
