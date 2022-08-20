import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pass or Fall Teller.");
        System.out.println("Enter the marks in first subject : ");
        float mark1 = sc.nextFloat();
        System.out.println("Enter the marks in second subject : ");
        float mark2 = sc.nextFloat();
        System.out.println("Enter the marks in thirst subject : ");
        float mark3 = sc.nextFloat();
        float total = mark1 + mark2 + mark3;
        float div = total / 300;
        float per = div * 100;
        System.out.println("Percentage obtained is : ");
        System.out.println(per);

        if (per>40 && mark1>33 && mark2>33 && mark3>33){
            System.out.println("Congratulation you are PASS.");
        }
        else{
            System.out.println("You are FAIL.");
        }
    }
}
