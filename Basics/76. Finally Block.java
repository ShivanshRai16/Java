public class Practice2{
    public static int greet(){
        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{ // Return is there but then also this will be executed (this is why it is used.)
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return 0;
    }

    public static void main(String[] args) {
        // greet();
        // int k = greet();
        // System.out.println(k);

        int x = 12;
        int y = 6;
        while(true){
            try{
                System.out.println(x/y);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{ // It will be executed at any cost wether there is a break present or not.
                System.out.println("I am final value of y = " + y);
            }
            y--;
        }

        try{
            System.out.println(50/3);
        }
        finally { // Without catch directly final can be written.
            System.out.println("Yes this is finally");
        }
    }
}
