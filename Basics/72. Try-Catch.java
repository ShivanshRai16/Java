public class Practice2{
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // Without Try:
        // int c = a / b;
        // System.out.println("The result is " + c);

        // With Try:
        try{ // this will try to perform the following task
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch(Exception e){ // If there will be any exception then it will be giving following output.
            System.out.println("We failed to perform this operation.");
            System.out.println(e);
        }
    }
}


// Handling Specific Exceptions
import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        int num[] = new int[3];
        num[0] = 50;
        num[1] = 86;
        num[2] = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index to be used : ");
        int ind = sc.nextInt();

        System.out.println("Enter the number to be divided with : ");
        int div = sc.nextInt();

        try{
            System.out.println("The value at entered index is : " + num[ind]);
            System.out.println("The result is : " + num[ind]/div);
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic Exception.");
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Array out of bounds exceptions.");
            System.out.println(b);
        }
        catch(Exception e){
            System.out.println("Some other exception.");
            System.out.println(e);
        }
    }
}
