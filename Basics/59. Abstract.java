abstract class Parent{ // Using this class other class will be formed.
                       // abstract's object cannot be formed. 
                       // a standard is formed and used as per own.
                       
    // Constructor
    public Parent(){
        System.out.println("I am the constructor of base.");
    }

    // Method
    public void sayHello(){
        System.out.println("Hello");
    }

    // Abstract
    abstract public void greet(); // Declare things later as per your need.
    abstract public void greet1();

}

class Child extends Parent{
    @Override
    public void greet(){ // greet method overriden.
        System.out.println("Good Morning.");
    }
    @Override
    public void greet1(){ // greet method overriden.
        System.out.println("Good Afternoon.");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("This is to check.");
    }
}

public class Practice2{
    public static void main(String[] args) {
        // Parent p = new Parent();  // Error because it is an abstract class and can not be implemented.
        // Child2 c = new Child2();  // same error
        Child c = new Child();

    }
}
