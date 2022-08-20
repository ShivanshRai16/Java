import java.util.Scanner;

public class Practice2 {  
    static float con(float val){
        float temp = 0;
        if (val>0){
            temp = (val * 9/5) + 32;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float val;

        System.out.println("Enter the temperature : ");
        float tem = sc.nextFloat();

        System.out.println("Temperature in Farrenheit is : ");
        System.out.println(con(tem));
    }
}
