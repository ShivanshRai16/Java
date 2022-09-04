class MyThr extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Thank You!");
            try {
                Thread.sleep(455); // This will make the method sleep for 455 milli sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        i++;
       }
    }
}

class MyThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Hello!");
            i++;
       }
    }
}

public class Practice2{
    public static void main(String[] args) {
        MyThr t1 = new MyThr();
        MyThr1 t2 = new MyThr1();

        t1.start();
        // try{
        //     t1.join(); // With this once t1 is executed then only t2 will start.
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
    }
}
