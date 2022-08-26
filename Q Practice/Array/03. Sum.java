public class Practice3{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 10};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}


// Sum and Average
public class Practice3{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 10};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        
        int avg = sum/arr.length;

        System.out.println(sum);
        System.out.println(avg);
    }
}

