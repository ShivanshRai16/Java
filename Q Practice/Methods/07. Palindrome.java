import java.util.Scanner;

public class Practice2{
    static boolean pali(int num){
        int temp = num;
        int rem;
        int rev = 0;

        while(temp > 0){
            rem = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + rem;
        }
        return rev == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(pali(num)){
            System.out.println("The number is palindrom.");
        }
        else{
            System.out.println("The number is not palindrom.");
        }
    }
}
