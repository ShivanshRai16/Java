import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num;
        boolean isSorted = true;
        num = new int[5];

        System.out.println("Enter the elements :- ");
        for (int i=0; i<num.length; i++){
            System.out.printf("Enter the %d element : ",i+1);
            num[i] = sc.nextInt();
        }

        System.out.println("\nElements in array is : ");
        for (int i=0; i<num.length; i++){
            System.out.printf("Element at %d is : ",i+1);
            System.out.println(num[i]);
        }

        System.out.println("\nElement sorted or not :-");
        for (int i=0; i<num.length-1; i++){
            if(num[i]>num[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The element is sorted.");
        }
        else {
            System.out.println("The element is not sorted.");
        }
    }
}


/*
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
*/
