public class Practice2{
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // Without Try:
        // int c = a / b;
        // System.out.println("The result is " + c);

        // With Try:
        try{ // this will try to perform the following task
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch(Exception e){ // If there will be any exception then it will be giving following output.
            System.out.println("We failed to perform this operation.");
            System.out.println(e);
        }
    }
}
