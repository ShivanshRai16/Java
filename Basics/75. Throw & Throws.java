import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Practice2{
    public static double area(int r) throws NegativeRadiusException{ // throws is used to declare that there is a chance of exception.
        double ar = Math.PI * r * r;
        return ar;
    }


    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int ra = sc.nextInt();

        try{
            // int c = divide(10, 5);
            // System.out.println(c);
            double a = area(ra);
            System.out.println(a);
            // throw new NegativeRadiusException(); this is there to throw that exception.
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
