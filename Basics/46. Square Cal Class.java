class Square{
    int dim;
    int ar;
    int pr;

    public void dim(){
        System.out.println("The dimensions of side is : " + dim);
    }

    public int area(){
        System.out.print("The area is : ");
        ar = dim * dim;
        return ar;
    }

    public int par(){
        System.out.print("The parameter is : ");
        pr = 4 * dim;
        return pr;
    }
}

public class Practice2{
    public static void main(String[] args) {
        Square side = new Square();

        side.dim = 5;
        side.dim();

        // side.area();
        System.out.println(side.area());

        // side.par();
        System.out.println(side.par());
    }
}
