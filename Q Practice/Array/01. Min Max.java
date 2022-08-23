public class Practice2{
    static void minmax(int [] num){
        int min = num[0];
        int max = num[0];

        for (int i=1; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
            else if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println("The minimum number is : " + min);
        System.out.println("The maximum number is : " + max);
    }

    public static void main(String[] args) {
        int [] nums = {100, 2, 250, 5, 1000};
        minmax(nums);
    }
}
