// import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // For loop break
        for (int i=0; i<10; i++){
            System.out.print(i);
            System.out.println(" Java is great.");
            if (i==5){
                System.out.println("Ending the loop.");
                break;
            }
        }

        // For loop continue
        for (int i=0; i<10; i++){
            if (i==5){
                System.out.println("Continue the loop.");
                continue;
            }
            System.out.print(i);
            System.out.println(" Java is great.");
        }

        // While loop break
        int i = 0;
        while (i<10){
            System.out.print(i);
            System.out.println(" Java is great.");
            if (i==9){
                System.out.println("Ending the loop.");
                break;
            }
            i++;
        }

        // While loop Continue
        int i = 0;
        while (i<10){
            i++;
            if (i==5){
                System.out.println("Continue the loop.");
                continue;
            }
            System.out.print(i);
            System.out.println(" Java is great.");
        }

        // do-While loop break
        int i = 0;
        do{
            System.out.print(i);
            System.out.println(" Java is great.");
            if (i==5){
                System.out.println("Ending the loop.");
                break;
            } 
            i++;
        }while (i<10);

        // do-While loop Continue
        int i = 0;
        do{
            i++;
            if (i==5){
                System.out.println("Continue the loop.");
                continue;
            }
            System.out.print(i);
            System.out.println(" Java is great.");
        }while (i<10);
    }
}
