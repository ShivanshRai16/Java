import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        int []num = new int[3];

        num[0] = 5;
        num[1] = 10;
        num[2] = 50;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.print("Enter the index to be used : ");
            int ind = sc.nextInt();

            try{
                System.out.println("Welcome to first try statement.");
                try{
                    System.out.println(num[ind]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException a){
                    System.out.println("Enter index does not exist.");
                    System.out.println("Exception level 2");
                }
            }
            catch(Exception e){
                System.out.println("Exception level 1");
            }
        }
        System.out.println("Exit!");
    }
}
