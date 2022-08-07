import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find leap year.");
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        float leap = year % 4;

        if (leap == 0){
            System.out.println("Enter year is a leap year.");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }
    }
}
