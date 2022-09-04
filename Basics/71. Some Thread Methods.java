class MyThr extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Good Morning");
            System.out.println("Priority : " + this.getPriority());
            System.out.println("State : " + this.getState()); // method is used to get the state of a given thread in Java.
            System.out.println("Thread : " + Thread.currentThread().getState()); // method is used to reference the current thread in Java.
            i++;
        }
    }
}

class MyThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Welcome");
            System.out.println("Priority : " + this.getPriority());
            System.out.println("State : " + this.getState());
            System.out.println("Thread : " + Thread.currentThread().getState());
            try {
                Thread.sleep(200);
            } 
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Thank You!");
            System.out.println("Priority : " + this.getPriority());
            System.out.println("State : " + this.getState());
            System.out.println("Thread : " + Thread.currentThread().getState());
            i++;
       }
    }
}

public class Practice3{
    public static void main(String[] args) {
        MyThr obj = new MyThr();
        MyThr1 obj1 = new MyThr1();
        MyThr2 obj2 = new MyThr2("Harry");

        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);

        obj.start();
        obj1.start();
        obj2.start();
    }
}
