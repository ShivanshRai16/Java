class Phone{
    public void showtime(){
        System.out.println("Time is 8 am");
    }

    public void on(){
        System.out.println("Turning on phone...");
    }
}

class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }

    @Override
    public void on(){
        System.out.println("Turnong on smartphone...");
    }
}

public class Practice2{
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // obj.name();

        Phone obj = new Smartphone(); // this thing is also allowed
        // Whenever it is new it is formed during run time.
        obj.showtime();
        obj.on();
        // obj.music(); Not Allowed
    }
}
