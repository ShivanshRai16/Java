interface Camera{
    void takeSnap();
    void recordVideo();

    private void greet(){ // This is a private method so it cannot be used in class to call 
                          // But it can be used in the default(if it is bigger).
        System.out.println("Good Morning!");
    }

    // void record4kVideo(); This will generate error if not added to any class so update accordingly.
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface wifi{ // Body cannot be formed in interface so class is formed.
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

// A class is formed using above interfaces
class MySmartPhone extends MyCellPhone implements wifi, Camera{
    // All the interfaces needed to be implemented in this class
    public void takeSnap(){
        System.out.println("Taking snap...");
    }

    public void recordVideo(){
        System.out.println("Recording video...");
    }

    public String[] getNetwork(){
        System.out.println("Getting list of Networks.");
        String[] networksList = {"Harry", "Prashant", "Anjali5G"};
        return networksList;
    }

    public void connectToNetwork(String network){
        System.out.println("Conneting to " + network);
    }

    @Override
    public void record4kVideo(){
        System.out.println("Recording 4k..."); // Overwriting the default method.
    }

    public void SampleMeth(){
        System.out.println("Sample Meth");
    }
}

public class Practice2{
    public static void main(String[] args) {
        // MySmartPhone ms = new MySmartPhone(); // This will use all the methods

        // String[] ar = ms.getNetwork();
        // for (String item : ar) {
        //     System.out.println(item);
        // }

        // ms.record4kVideo();
        // ms.SampleMeth();
        // ms.recordVideo();
        // ms.getNetwork();
        // ms.callNumber(7979);

        Camera cam = new MySmartPhone(); // This is a smartphone but, use it as a camera method
        // cam.getNetworks();  This will through error as this is not present inside the camera
        // cam.callNumber();
        // cam.SampleMeth();
        cam.takeSnap();
    }
}


// Polymorphism Example
class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }

    public void bite(){
        System.out.println("Bitting...");
    }
}

interface BasicAnimal{
    public void eat();
    public void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Speaking...");
    }

    public void look(){
        System.out.println("Looking...");
    }

    @Override
    public void eat(){
        System.out.println("Eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

public class Practice2{
    public static void main(String[] args) {
        Human sc = new Human();
        sc.eat();
        sc.sleep();
        sc.look();

        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();
    }
}


// Polymorphism Example 2
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelePhone extends TelePhone{
    @Override
    public void ring(){
        System.out.println("Phone Ringing...");
    }

    @Override
    public void lift(){
        System.out.println("Lifting phone...");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnected phone...");
    }
}

public class Practice2{
    public static void main(String[] args) {
        SmartTelePhone t = new SmartTelePhone();
        t.ring();
    }
}
