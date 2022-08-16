// import java.util.Scanner;

public class Practice2 {
    static float avg(int ...x){  
        float average = 0;
        float sum = 0;
        for(int a:x){
            sum += a;
            average = sum / x.length;
        }
        return average;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // float [] num;
        // num = new float[5];

        // System.out.println("Enter the elements :- ");
        // for(int i=0; i<num.length; i++){
        //     System.out.printf("Enter the element %d : ",i);
        //     num[i] = sc.nextInt();
        // }

        // System.out.println("The average is : ");
        // System.out.println(num);

        System.out.println("The average is "+ avg(4, 5, 3, 10, 12));
    }
}
