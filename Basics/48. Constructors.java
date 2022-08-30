class Employee{
    private int id;
    private String name;

    // Constructer
    // Member funcation used to initialize an object while creating it.
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

// Constructors Overloading
    class Employee{
        private int id;
        private String name;

        public Employee(){
            id = 45;
            name = "Harry";
        }

        // Constructer
        public Employee(String myname, int myid){
            id = myid;
            name = myname;
        }

        public Employee(String myname){
            id = 4;
            name = myname;
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
            // Employee harry = new Employee("Harry s singh", 455);
            Employee harry = new Employee("Harry r singh");
            // Employee harry = new Employee();

            // harry.setName("Harry Singh");
            // harry.setId(45);

            System.out.println(harry.getName());
            System.out.println(harry.getId());
        }
    }

