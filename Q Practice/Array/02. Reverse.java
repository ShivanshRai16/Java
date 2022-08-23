public class Practice2{
    public static void main(String[] args) {
        int [] nums = {100, 2, 250, 5, 1000};

        for (int i=0; i<nums.length; i++){
            System.out.print(" " + nums[i]);
        }
        
        System.out.println();

        for (int j=nums.length-1; j>=0; j--){
            System.out.print(" " + nums[j]);
        }
    }
}
