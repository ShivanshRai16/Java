class test{
    public int a;

    // test(int v){
    //     a = v;
    // }
    
    test(int a){
        this.a = a; // this variable name is same inside method so this is used to reffer it is basically a referance.
    }    

    public int returnone(){
        return 1;
    }

    public int getA() {
        return a;
    }
}

public class Practice2{
    public static void main(String[] args) {
        test t = new test(5);
        System.out.println(t.getA());
    }
}
