// Rectangle
// Normal way
class rectangle{
    private int length;
    private int height;

    public int getheight(){
        return height;
    }

    public void setheight(int h){
        this.height = h;
    }

    public int getlength(){
        return length;
    }

    public void setlength(int l){
        this.length = l;
    }

    public int area(){
        int area = length * height;
        return area;
    }

    public int para(){
        int para = 2 * (length + height);
        return para;
    }
}

public class Practice3{
    public static void main(String[] args) {
        rectangle dim = new rectangle();

        System.out.println("The length is : ");
        dim.setlength(10);
        System.out.println(dim.getlength());

        System.out.println("The height is : ");
        dim.setheight(20);
        System.out.println(dim.getheight());

        System.out.println("The area of the rectangle is : ");
        System.out.println(dim.area());

        System.out.println("The parameter of the ractangle is : ");
        System.out.println(dim.para());
    }
}
