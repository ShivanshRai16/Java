import java.util.Scanner;

public class Practice3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            // System.out.print("Entre the first number : ");
            int a = sc.nextInt();
            // System.out.print("Entre the Second number : ");
            int b = sc.nextInt();
            // System.out.print("Entre the times number : ");
            int n = sc.nextInt();

            for(int j=0; j<n; j++){
                a += b;
                if(j>=0)
                // An if statement applies to a single line of code. If you need more than a single line, it needs brackets.
                System.out.print(" ");
                System.out.print(a);
                b = b * 2;
                
            }
            System.out.println("");
        }
    }
}

/* t = 2, a = 5, b = 3, n = 10
 * when j = 1
 * a += b --> 5 + 3 = 8 --> a = 8
 * _8
 * b = b * 2 --> b = 3*2 --> b = 6;
 * ---------------------------------
 * when j = 2
 * a += b --> 8 + 6 --> a = 14
 * _8_14
 * b = b * 2 --> b = 6*2 --> b = 12;
 * ---------------------------------
 * when j = 3
 * a += b --> 14 + 12 --> a = 26
 * _8_14_26
 * b = b * 2 --> b = 12*2 --> b = 24;
 * ---------------------------------
 * when j = 4
 * a += b --> 26 + 14 --> a = 50
 * _8_14_26_50
 * b = b * 2 --> b = 24*2 --> b = 48;
 * .
 * .
 * .
 * .
 * .
 * .
 * till j = n
 */
