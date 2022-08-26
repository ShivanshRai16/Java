class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I setting x now.");
        this.x = x;
    }
}
// We can only access X from the Base

// We can only access both X and Y from the Derived

class Derived extends Base{
    int y;

    public int getY() {
        System.out.println("I setting y now.");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Practice2{
    public static void main(String[] args) {
        // creating an object of base class
        Base b = new Base();
        // Derived b = new Derived(); Setx and getx are there in base but it can be derived from another class.
        b.setX(4);
        // b.getX();
        System.out.println(b.getX());

        // creating an object of derived class
        Derived d = new Derived();
        d.setY(6);
        System.out.println(d.getY());
    }
}
