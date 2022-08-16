import java.util.Scanner;

public class Practice2 {
    static int pattern(int x){
        for (int i=x; i>0; i--){   // for (int i=0; i<x; i++)
            for (int j=0; j<i; j++){  // for (int j=x; j>i; j--)
                System.out.print("* ");
            }
            System.out.println("");
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of star : ");
        int st = sc.nextInt();
        
        int star;
        star = pattern(st);
    }
}

/*
Enter the number of star : 
5
* * * * * 
* * * *   
* * *
* *
*
*/
