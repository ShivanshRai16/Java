import java.util.Scanner;

public class Practice2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rstr = "";
        int strlen = str.length();

        for(int i = (strlen - 1); i>=0; --i){
            rstr = rstr + str.charAt(i);
        }

        if(str.toLowerCase().equals(rstr.toLowerCase())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
