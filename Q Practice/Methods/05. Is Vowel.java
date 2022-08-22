import java.util.Scanner;

public class Practice2{
    static boolean isVowel(char let){
        switch(let){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word : ");
        String word = sc.nextLine();

        int count = 0;

        for (int i=0; i<word.length(); i++){
            if(isVowel(word.charAt(i))){
                count ++;
            }
        }

        System.out.println("Numbers of vowels : ");
        System.out.println(count);
    }
}
