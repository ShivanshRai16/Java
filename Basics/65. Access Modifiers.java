class C1{
    public int pub = 5;
    protected int pro = 45;
    int x = 10;
    private int pri = 50;
    
    public void meth1(){
        System.out.println(pri); // Here it can be used int he same class.
        System.out.println(x);
        System.out.println(pro);
        System.out.println(pub);
    }
}

public class Practice2{
    public static void main(String[] args) {
        C1 c = new C1();
        System.out.println(c.pub);
        System.out.println(c.pro);
        System.out.println(c.x);
        // System.out.println(c.pri); Throws error as private cannot be used in pakage.

        c.meth1();
    }
}
