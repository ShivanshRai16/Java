import java.util.Scanner;

public class Practice2 {  
    static void Pattern(int num){
        if (num > 0){
            Pattern(num - 1);
            for (int i=0; i<num; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print its star : ");
        int n = sc.nextInt();

        System.out.println("The patten is : ");
        Pattern(n);
    }
}
