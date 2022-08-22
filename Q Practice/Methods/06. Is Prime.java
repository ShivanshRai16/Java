import java.util.Scanner;

public class Practice2{
    static boolean isPrime(int num){
        for (int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check : ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));

        System.out.println("Prime number between 1 to 500 is : ");
        for (int i=1; i<=500; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
