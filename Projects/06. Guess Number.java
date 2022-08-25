import java.util.Random;
import java.util.Scanner;

class guess{
    private int Enum;
    private int randomNumber;
    private int k=0;

    public int getNoOfGuesses() {
        return k;
    }

    public void setNoOfGuesses(int k) {
        this.k = k;
    }

    guess(){
        Random newnum = new Random();
        this.randomNumber = newnum.nextInt(100);
    }

    void takeUserInput(){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        Enum = sc.nextInt();
    }

    boolean isCorrectNumber(){
        k++;
        if (Enum == randomNumber){
            System.out.println("Congratulation! you guessed it right.");
            System.out.println("You guessed it in " + k);
            System.out.println("The number is : " + randomNumber);
            return true;
        }
        else if (Enum < randomNumber){
            System.out.println("You entered smaller number.");
        }
        else if (Enum > randomNumber){
            System.out.println("You entered greater number.");
        }
        return false;
    }
}

public class Practice1{
    public static void main(String[] args) {

        guess num = new guess();
        
        boolean b = false;
        while(!b){
            num.takeUserInput();
            b = num.isCorrectNumber();
        }
    }
}
