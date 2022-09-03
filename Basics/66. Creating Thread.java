class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("My thread is running ");
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Thread 1 is running");
            System.out.println("I am ok");
            i++;
        }
    }
}

public class Practice2{
    public static void main(String[] args) {
        MyThread t = new MyThread(); // this are object its methods are to be created.
        MyThread1 t1 = new MyThread1();
        t.start(); // thread is (executed) started with a start method 
        t1.start();
    }
}


/*
 * At a time only one thread will execute and then another.
 * Turn by turn execution will take place of the thread.\
 * In normal it will execute first thread after its exection only next thread will be executed.
 */
