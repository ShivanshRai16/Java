import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr;
        arr = new int[5];

        System.out.println("Enter an array :- ");
        for (int i=0; i<arr.length; i++){
            System.out.printf("Enter the element at %d : ",i+1);
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in array are :- ");
        for (int i=0; i<arr.length; i++){
            System.out.printf("Element at %d is : ",i+1);
            System.out.println(arr[i]);
        }

        System.out.println("Elemts in array in reverse order is : ");
        for (int i=arr.length-1; i>=0; i--){
            System.out.printf("Element at %d in reverse is : ",i+1);
            System.out.println(arr[i]);
        }
    }
}
