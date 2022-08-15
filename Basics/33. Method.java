public class Practice2 {
//  Method invocation using object creation.
//  int logic(int x, int y){
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c;
//      Practice2 obj = new Practice2();
//      c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(c);

        int a1 = 3;
        int b1 = 1;
        int c1;
//      c1 = obj.logic(a1, b1);
        c1 = logic(a1, b1);
        System.out.println(c1); 
    }
}
