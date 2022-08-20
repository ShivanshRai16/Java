import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner website = new Scanner(System.in);
        System.out.println("Site Type.");
        System.out.println("Enter the website url : ");
        String web = website.nextLine();

        if(web.endsWith(".com")){
            System.out.println("Entered website is commercial website.");
        }
        else if(web.endsWith(".org")){
            System.out.println("Entered website is organizational website.");
        }
        else if(web.endsWith(".in")){
            System.out.println("Entered website is Indian website.");
        }
    }
}
