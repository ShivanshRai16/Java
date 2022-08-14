import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] marks;
        marks = new int[5];

        System.out.println("Enter the marks :- ");
        for (int i=0; i<marks.length; i++){
            System.out.printf("Enter the marks in subject %d : ", i+1);
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks are :- ");
        for (int j=0; j<marks.length; j++){
            System.out.printf("Marks in %d subject is : %d \n", j+1, marks[j]);
        }

        System.out.println("\nMarks Average :- ");
        float sum = 0;
        for (int k=0; k<marks.length; k++){
            sum = sum + marks[k];
        }
        System.out.println("Sum of marks is : ");
        System.out.println(sum);

        float avg = sum / marks.length;
        System.out.printf("\nAverage of the marks is : %.2f\n", avg);
    }
}
