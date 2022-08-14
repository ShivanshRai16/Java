import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num;
        num = new int[5];

        System.out.println("Enter the elements :- ");
        for(int i=0; i<num.length; i++){
            System.out.printf("Enter the element %d : ",i);
            num[i] = sc.nextInt();
        }
        
        System.out.println("Elements are :- ");
        for(int j=0; j<num.length; j++){
            System.out.printf("Element %d id : ",j);
            System.out.println(num[j]);
        }
    }
}
