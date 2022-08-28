// More than one classs is difficult to extend so interface is created
interface Bicycle{
    int a = 45;
    void applyBrake(int Decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Poo");
    }

    public void applyBrake(int Decrement){
        System.out.println("Applying brake.");
    }

    public void speedUp(int increment){
        System.out.println("Incresing speed.");
    }

    public void blowHornK3g(){
        System.out.println("pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("po po po po");
    }
}

public class Practice2{
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(2);
        System.out.println(cycle.a);
        System.out.println(cycle.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycle.blowHornK3g();
        cycle.blowHornmhn();
    }
}
