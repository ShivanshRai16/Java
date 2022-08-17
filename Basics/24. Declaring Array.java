public class Practice2 {
    public static void main(String[] args) {
        // Three ways to create array
        // Int Datatype 
        // Basic Declaration
        int [] marks;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 60;
        marks[3] = 40;
        marks[4] = 20;
        System.out.println(marks[1]);

        // Declaration + Memory allocation
        int [] marks1 = new int[5];
        marks1[0] = 100;
        marks1[1] = 80;
        marks1[2] = 60;
        marks1[3] = 40;
        marks1[4] = 20;
        System.out.println(marks1[3]);

        // Declaration + initialization
        int [] marks2 = {100, 80, 60, 40, 20};
        System.out.println(marks2[4]);
        
        // String Data Type
        String [] name;
        name = new String[5];
        name[0] = "Shivansh";
        name[1] = "Rohan";
        name[2] = "Shivam";
        name[3] = "Aditya";
        name[4] = "Shilpa";
        System.out.println(name.length);
        System.out.println(name[0]);
        
        // Float Data Type
        float [] mark;
        mark = new float[5];
        mark[0] = 100;
        mark[1] = 80.4f;
        mark[2] = 60.8f;
        mark[3] = 40.3f;
        mark[4] = 20.2f;
        System.out.println(mark.length);
        System.out.println(mark[3]);
    }
}
