class MyThreadRunner implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Thread is running.");
        }
    }
}

class MyThreadRunner1 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("Thread Stoped.");
        }
    }
}

public class Practice2{
    public static void main(String[] args) {
        MyThreadRunner obj = new MyThreadRunner();
        Thread t = new Thread(obj); // thread method is to be created to call the run method

        MyThreadRunner1 obj1 = new MyThreadRunner1();
        Thread t2 = new Thread(obj);

        t.start(); 
        t2.start();
    }
}
