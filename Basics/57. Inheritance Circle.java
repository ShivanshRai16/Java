// Circle and Cylinder normal
class Circle{
    int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}

class Cyli extends Circle{
    int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}

public class Practice2{
    public static void main(String[] args) {
        Circle radius = new Circle();
        radius.setR(5);
        System.out.println("The radius of the circle is : " + radius.getR());

        Cyli height = new Cyli();
        height.setH(10);
        System.out.println("The height of the cylinder is : " + height.getH());
    }
}
