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
