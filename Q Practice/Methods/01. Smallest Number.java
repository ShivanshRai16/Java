import java.util.Scanner;

public class Practice2{
    static void small(float n1, float n2, float n3){
        if(n1>n2 && n1>n3){
            System.out.printf("%d is smallest.", n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.printf("%d is smallest.", n2);
        }
        else if(n3>n1 && n3>n2){
            System.out.printf("%d is smallest.", n3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the first number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the first number : ");
        int num3 = sc.nextInt();

        int sml = small(num1, num2, num3);
    }
}
