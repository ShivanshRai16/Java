// Sphere
// Normal way
class sphere{
    private int radius;

    public int getRadius(){
        return radius;
    }

    public void setradius(int r){
        this.radius = r;
    }

    public float area(){
        float area = 4 * 3.14f * radius * radius;
        return area;
    }

    public float volume(){
        float volume = 1.33f * 3.14f * radius * radius * radius;
        return volume;
    }
}

public class Practice2{
    public static void main(String[] args) {
        sphere dim = new sphere();

        System.out.println("The radius is : ");
        dim.setradius(5);
        System.out.println(dim.getRadius());

        System.out.println("The area is : ");
        System.out.println(dim.area());

        System.out.println("The volume is : ");
        System.out.println(dim.volume());
    }
}
