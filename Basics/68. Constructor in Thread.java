// Thread(String name) constructor
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i=25;
        System.out.println("Thank You!");
//      while(true){
//            System.out.println("I am a thread");
//        }
    }
}

public class Practice2{
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram");

        t1.start();
        t2.start();

        System.out.println(t1.getId());
        System.out.println(t1.getName());

        System.out.println(t2.getId());
        System.out.println(t2.getName());
    }
}
