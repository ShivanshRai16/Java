// import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("For AND operators.");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if(a && b && c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("For OR operators.");
        boolean d = true;
        boolean e = false;
        boolean f = false;
        if(d || e || f){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("For NOT operator.");
        boolean g = true;
        System.out.println(!g);
        boolean h = false;
        System.out.println(!h);
    }
}
