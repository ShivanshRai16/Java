public class Practice2 {
    // static int sum(int a, int b){
    //     return a+b;
    // }

    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    // static int sum(int a, int b, int c, int d){
    //     return a+b+c+d;
    // }


    // The above thing can be sumarized as
    static int sum(int ...arr){
    // static int sum(int x, int ...arr){ Here atleast one integer is required now.
        // Available as in [] arr
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of nothing is : "+sum()); // This case fail when one integer is required.
        System.out.println("The sum of 4 and 5 is : "+sum(4, 5));
        System.out.println("The sum of 4, 3 and 5 is : "+sum(4, 3, 5));
        System.out.println("The sum of 4, 3, 1 and 5 is : "+sum(4, 3, 1, 5));
    }
}
