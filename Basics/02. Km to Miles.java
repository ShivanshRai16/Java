import java.util.Scanner; // Inbuild packages

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometer : ");
        float km = sc.nextFloat();

        float miles = (float) (km * 0.6213);
        System.out.println("The miles is : ");
        System.out.println(miles);
    }
}
