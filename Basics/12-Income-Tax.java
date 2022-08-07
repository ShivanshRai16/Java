import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Income Tax");
        System.out.println("Enter your income : ");
        float income = sc.nextFloat();
        float tax = 0;

        if (income<=2.5f){
            System.out.println("No Income tax");
            tax = tax + 0;
        }
        else if (income>2.5f && income<5){
            System.out.println("Income tax is 5%");
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5 && income<10){
            System.out.println("Income tax is 20%");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10){
            System.out.println("Income tax is 30%");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Tax amount is : ");
        System.out.println(tax);
    }
}
