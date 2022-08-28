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


// Circle and Cylinder cal area and volume
class Circle{
    public int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    // method crated
    Circle(int r){
        this.r = r;
    }

    public double area(){
        double area = 3.14f * r * r;
        return area;
    }
}

class Cyli extends Circle{
    Cyli(int r, int h){
        super(r);
        this.h = h;
    }

    public int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double volume(){
        double volume = 3.14f * r * r * h;
        return volume; 
    }
}

public class Practice2{
    public static void main(String[] args) {
        Circle radius = new Circle(5);
        // radius.setR(5);
        System.out.println("The radius of the circle is : " + radius.getR());
        System.out.println("The area of circle is : " + radius.area());

        Cyli height = new Cyli(5, 10);
        // height.setH(10);
        System.out.println("The height of the cylinder is : " + height.getH());
        System.out.println("The volume of cylinder is : " + height.volume());
    }
}
