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


// Thread(Runnable r, String name) constructor
class MyThr implements Runnable{
    public MyThr(String name){
        super();
    }

    @Override
    public void run(){
        int i=45;
        System.out.println("This is a runnable thread");
    }
}

public class Practice2{
    public static void main(String[] args) {
        MyThr obj1 = new MyThr("Harry");
        // Thread t1 = new Thread(obj1); this will give name as thread 0 
        Thread t1 = new Thread(obj1, "Harry"); // This will give name which is setted


        MyThr obj2 = new MyThr("Ram");
        // Thread t2 = new Thread(obj2); this will give name as thread 1
        Thread t2 = new Thread(obj2, "Ram");

        t1.start();
        t2.start();

        System.out.println(t1.getId());
        System.out.println(t1.getName());

        System.out.println(t2.getId());
        System.out.println(t2.getName());
    }
}
