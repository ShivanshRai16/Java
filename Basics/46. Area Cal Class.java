// SQUARE
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


// RECTANGLE
class Rectangle{
    int length;
    int breath;
    int ar;
    int para;

    public void dim(int l, int b){
        length = l;
        breath = b;
        System.out.println("The length of rectangle is : " + l);
        System.out.println("The breath of rectangle is : " + b);
    }

    public int area(){
        System.out.print("The area of rectangle is : ");
        ar = length * breath;
        return ar;
    }

    public int parameter(){
        System.out.print("The parameter of rectangle is : ");
        para = 2 * (length + breath);
        return para;
    }
}

public class Practice2{
    public static void main(String[] args) {
        Rectangle val = new Rectangle();

        val.dim(10, 5);
        // System.out.println(val.dim());

        System.out.println(val.area());

        System.out.println(val.parameter());
    }
}


// CIRCLE
class Circle{
    float r;
    float ar;
    float para;

    public void r(){
        System.out.println("The radius of the circle is : " + r);
    }

    public float area(){
        System.out.print("The area of the circle is : ");
        ar = 3.14f * r * r;
        return ar;
    }

    public float para(){
        System.out.print("The parameter of the circle is : ");
        para = 2 * 3.14f * r;
        return para;
    }
}

public class Practice2{
    public static void main(String[] args) {
        Circle val = new Circle();

        val.r = 5;
        val.r();

        System.out.println(val.area());

        System.out.println(val.para());
    }
}
