class Rectangle{
    public int length;
    public int height;

    public Rectangle(int length, int height){
        this.length = length;
        this.height = height;
    }
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        int area = length * height;
        return area;
    }
}

class Cuboid extends Rectangle{
    public int breath;

    public Cuboid(int length, int height, int breath){
        super(length, height);
        this.breath = breath;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int volume(){
        int volume = length * height * breath;
        return volume;
    }
}

public class Practice2{
    public static void main(String[] args) {
        Rectangle dim = new Rectangle(5, 10);
        System.out.println("The length of the shape is : " + dim.getLength());
        System.out.println("The height of the shape is : " + dim.getHeight());
        System.out.println("The area of the rectangle is : " + dim.area());

        Cuboid cdim = new Cuboid(5, 10, 10);
        System.out.println("The breath of cuboid is : " + cdim.getBreath());
        System.out.println("The volume of the cuboid is : " + cdim.volume());
    }
}
