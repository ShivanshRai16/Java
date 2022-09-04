class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i=25;
        while(true){
//          System.out.println("I am a thread");
            System.out.println("Thank You!" + this.getName());
       }
    }
}

public class Practice2{
    public static void main(String[] args) {
        MyThr t1 = new MyThr(" Harry 1");
        MyThr t2 = new MyThr(" Harry 2");
        MyThr t3 = new MyThr(" Harry 3");
        MyThr t4 = new MyThr(" Harry 4");
        MyThr t5 = new MyThr(" Harry 5 (Most Important.)");
        
        t5.setPriority(Thread.MAX_PRIORITY); // Maximum time this code will be exicuted since it has top priority.
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
