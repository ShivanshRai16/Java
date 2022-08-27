class Base{
    Base(){
        System.out.println("I'm an contructor.");
    }

    Base(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    Derived(){
        // super(0); // With this ot will call the base which has argument of x.
        System.out.println("I'am a derived class constructors.");
    }

    Derived(int x, int y){
        super(x); // With this it will call the base which has argument of x.
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildofDerived extends Derived{
    ChildofDerived(){
        System.out.println("I am a child of derived constructor");
    }

    ChildofDerived(int x, int y, int z){
        super(x, y); // It will go up and will call the x and y value. Means go up and bring the value of x and y.
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }

    public int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
}

public class Practice2{
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived(); // First it will call base contructor and then derived constructor.
        // Derived d1 = new Derived(4, 9);
        // ChildofDerived c = new ChildofDerived();
        ChildofDerived c1 = new ChildofDerived(4, 8, 10);
    }
}
