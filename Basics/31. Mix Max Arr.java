import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr;
        arr = new int[5];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

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

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.print("Minimul value in array is : ");
        System.out.println(min);

        System.out.print("Maximum Value in array is : ");
        System.out.println(max);
    }
}
