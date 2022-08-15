public class Practice2 {
    static void foo(){
        System.out.println("Good morning!");
    }

    static void foo(int a){ // This take argument as int.
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){ // a and b are parameters
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    public static void main(String[] args) {
        foo();
        foo(3000); 
        foo(3000, 4000); // Here 3000 and 4000 are arguments(this are actual).
    }
}
