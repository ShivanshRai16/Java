import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal=0, i=0;

        System.out.println("Enter the binary number : ");
        int num = sc.nextInt();

        while(num!=0){
            int remainder = num%10;
            num /= 10;
            decimal += remainder * Math.pow(2, i);
            ++i;
        }
        System.out.println(decimal);
    }
}
