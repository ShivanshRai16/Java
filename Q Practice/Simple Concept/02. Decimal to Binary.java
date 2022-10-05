import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i=1<<7; i>0; i=i/2){
            if((num & i) != 0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
    }
}
