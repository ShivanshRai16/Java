import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat1;
        int [][] mat2;
        int [][] sum;
        mat1 = new int [2][3];
        mat2 = new int [2][3];
        sum = new int [2][3];

        System.out.println("Enter the element of matrix 1 :- ");
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<=mat1.length; j++){
                System.out.printf("Enter the element at [%d,%d] matrix 1 : ", i, j);
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the element of matrix 2 :- ");
        for (int a=0; a<mat2.length; a++){
            for (int b=0; b<=mat2.length; b++){
                System.out.printf("Enter the element at [%d,%d] matrix 2 : ", a, b);
                mat2[a][b] = sc.nextInt();
            }
        }

        System.out.println("\nElements at matrix 1 :-");
        for (int k=0; k<mat1.length; k++){
            for (int l=0; l<=mat1.length; l++){
                System.out.printf("Element at [%d,%d] is in martrix 1 : ", k, l);
                System.out.println(mat1[k][l]);
            }
        }

        System.out.println("\nElements at matrix 2 :-");
        for (int c=0; c<mat2.length; c++){
            for (int d=0; d<=mat2.length; d++){
                System.out.printf("Element at [%d,%d] is in martrix 2 : ", c, d);
                System.out.println(mat2[c][d]);
            }
        }

        System.out.println("\nSum of the martix is :- ");
        for (int m=0; m<sum.length; m++){
            for (int n=0; n<=sum.length; n++){
                sum[m][n] = mat1[m][n] + mat2[m][n];
                System.out.print(sum[m][n]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
