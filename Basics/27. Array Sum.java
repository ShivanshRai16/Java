public class Practice2 {
    public static void main(String[] args) {
        float [] num;
        num = new float[5];

        num[0] = 1.5f;
        num[1] = 2.5f;
        num[2] = 3.5f;
        num[3] = 4.5f;
        num[4] = 5.5f;

        System.out.println("Array is : ");
        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
        float sum = 0;
        for(float element:num){
            sum = sum + element;
        }
        System.out.println("The sum is : ");
        System.out.println(sum);
    }
}
