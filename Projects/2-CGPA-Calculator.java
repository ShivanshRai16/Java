import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("CGPA Calculator.");
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter the marks in first subject : ");
        float mark1 = mark.nextFloat();
        System.out.println("Enter the marks in second subject : ");
        float mark2 = mark.nextFloat();
        System.out.println("Enter the marks in third subject : ");
        float mark3 = mark.nextFloat();
        System.out.println("Enter the marks in fourth subject : ");
        float mark4 = mark.nextFloat();
        System.out.println("Enter the marks in fifth subject : ");
        float mark5 = mark.nextFloat();
        float sum = mark1 + mark2 + mark3 + mark4 + mark5;
        float div = sum / 50;
        System.out.println("CGPA is : ");
        System.out.println(div);
    }
}
