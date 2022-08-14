import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num;
        int check;
        boolean inArray = false;
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

        System.out.println("To check element.");
        System.out.println("Enter the element to check : ");
        check = sc.nextInt();

        for(int k=0; k<num.length; k++){
            if(num[k] == check){
                inArray = true;
                break;
            }
        }
        if(inArray){
            System.out.printf("The element is present.");
        }
        else{
            System.out.println("Element is not present.");
        }

        // for(int k=0; k<num.length; k++){
        //     if(num[k] == check){
        //         System.out.println("The element is present.");
        //     }
        //     else{
        //         System.out.println("");
        //     }
        // }
    }
}
