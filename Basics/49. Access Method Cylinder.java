// Cylinder
// Normal way
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    
    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        this.radius = r;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public double surface(){
        double area = (2 * 3.14f * radius * height) + (2 * 3.14f * (radius * radius));
        return area;
    }

    public double volume(){
        double volume = 3.14 * radius * radius * height;
        return volume;
    }
}

public class Practice3{
    public static void main(String[] args) {
        cylinder dim = new cylinder(10, 45);

        System.out.print("Radius is : ");
        // dim.setRadius(10);
        System.out.println(dim.getRadius());

        System.out.print("Height is : ");
        // dim.setHeight(45);
        System.out.println(dim.getHeight());

        System.out.println("The surface area of cylinder is : ");
        System.out.println(dim.surface());

        System.out.println("The volume of the sylinder is : ");
        System.out.println(dim.volume());
    }
}


// Using Constructors
class cylinder{
    private int radius;
    private int height;

    public cylinder(int newradius, int newheight){
        radius = newradius;
        height = newheight;
    }

    // public cylinder(int radius, int height) {
    //     this.radius = radius;
    //     this.height = height;
    // }
    
    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        this.radius = r;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public double surface(){
        double area = (2 * 3.14f * radius * height) + (2 * 3.14f * (radius * radius));
        return area;
    }

    public double volume(){
        double volume = 3.14 * radius * radius * height;
        return volume;
    }
}

public class Practice3{
    public static void main(String[] args) {
        cylinder dim = new cylinder(10, 45);

        System.out.print("Radius is : ");
        // dim.setRadius(10);
        System.out.println(dim.getRadius());

        System.out.print("Height is : ");
        // dim.setHeight(45);
        System.out.println(dim.getHeight());

        System.out.println("The surface area of cylinder is : ");
        System.out.println(dim.surface());

        System.out.println("The volume of the sylinder is : ");
        System.out.println(dim.volume());
    }
}
