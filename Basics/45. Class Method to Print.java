class cellphone{
    public void ringing(){
        System.out.println("The phone is ringing.");
    }

    public void vibrating(){
        System.out.println("The phone is vibrating.");
    }

    public void calling(){
        System.out.println("The phone is calling Dave.");
    }

    public void messaging(){
        System.out.println("The phone is messaging John.");
    }
}

public class Practice2{
    public static void main(String[] args) {
        cellphone asus = new cellphone();

        asus.ringing();
        asus.vibrating();
        asus.calling();
        asus.messaging();
    }
}
