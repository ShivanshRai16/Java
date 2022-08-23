class Employee{
    private int id;
    private String name;

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
        // harry.id = 45;
        // harry.name = "Harry singh"; --> Throws an error due to private access modifier

        harry.setName("Harry singh");
        System.out.println(harry.getName());

        harry.setId(45);
        System.out.println(harry.getId());
    }
}
