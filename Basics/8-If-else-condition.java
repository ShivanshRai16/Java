import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner ag = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = ag.nextInt();
        if(age>18){
            System.out.println("Yes you can drive.");
        }
        else{
            System.out.println("No you can't drive");
        }
    }
}
