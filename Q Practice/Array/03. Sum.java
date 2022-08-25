public class Practice3{
    static void sort(int [] arr){
        int sum = arr[0];

        for (int i:arr){
            sum = sum + i;
        }
        System.out.println("The sum is : " + sum);

    }

    public static void main(String[] args) {
        int str[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort(str);
    }
}
