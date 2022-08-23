class Employee{
    private int id;
    private String name;

    // Constructer
    public Employee(){
        id = 45;
        name = "Your name here";
    }

    // Getters
    public String getName(){
        return name;
    }
    
    // Setters
    public void setName(String n){
        this.name = n;
        // name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        id = i;
        // this.id = i;
    }
}

public class Practice2{
    public static void main(String[] args) {
        Employee harry = new Employee();

        // harry.setName("Harry Singh");
        // harry.setId(45);

        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
