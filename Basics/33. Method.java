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



// Void method does not need to have a return type.
public class Practice2 {
    static void telljoke(){
        System.out.println("I invented a new word! " +
                            "Plagiarism!");
    }

    public static void main(String[] args) {
        telljoke();
    }
}



// In case of array if we change the value it get changes.
public class Practice2 {
    // Case 1: changing the integer
    // static void change(int a){
    //     a = 90;
    // }

    // Case 2: Changing the array
    static void change2(int [] arr){
        arr[0] = 90;
    }

    public static void main(String[] args) {
        int [] marks = {52, 33, 65, 89, 55};

        // Case 1: changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is : " + x);

        // Case 2: Changing the array
        change2(marks); // Here reference is passed that is why its value changes.
                        // Not the copy of the object is being passed.
        System.out.println("The value of x after running change is: " + marks[0]);
    }
}
