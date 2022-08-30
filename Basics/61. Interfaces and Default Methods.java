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
}

public class Practice2{
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();

        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }

        ms.record4kVideo();
    }
}
