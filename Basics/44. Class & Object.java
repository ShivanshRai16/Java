class Employee{
    int age;
    int salary;
    String name;
    // Creating a method for printing 
    public void printDetails(){
        System.out.println("My age is : "+ age);
        System.out.println("My name is : "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Practice2{
    public static void main(String[] args) {
        System.out.println("This is a custom class.");
        // Instantiating a new Employee Object
        Employee dave = new Employee(); 
        Employee john = new Employee();

        // Setting Attributes for dave
        dave.age = 21;
        dave.name = "Dave R";
        dave.salary = 34;

        // Setting Attributes for john
        john.age = 26;
        john.name = "John S";
        john.salary = 15;

        // Printing the attributes
        // System.out.println(shivansh.age);
        // System.out.println(shivansh.name);

        // Calling method
        dave.printDetails(); 
        int salary = dave.getSalary();
        System.out.println(salary);

        john.printDetails();
        int salary2 = john.getSalary();
        System.out.println(salary2);
    }
}


// Similar Type
class Employee{
    int age;
    int salary;
    String name;

    public void age(){
        System.out.println("The age is : " + age);
    }

    public void getSalary(){
        System.out.println("The salary is : " + salary);
    }

    public void getName(){
        System.out.println("The name is : " + name);
    }

    // public String getName(){
    //     return name;
    // }
    
    // public void setName(String n){
    //     name = n;
    // }
}

public class Practice2{
    public static void main(String[] args) {
        Employee Dave = new Employee();
        Employee John = new Employee();

        Dave.age = 25;
        Dave.salary = 25;
        Dave.name = "Dave S";
        // Dave.setName("Dave S");
        // System.out.println(Dave.getName());

        John.age = 22;
        John.salary = 35;
        John.name = "John W";

        Dave.getName();
        Dave.age();
        Dave.getSalary();

        System.out.println("");

        John.getName();
        John.age();
        John.getSalary();
    }
}
