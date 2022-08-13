public class Practice2 {
    public static void main(String[] args) {
        // Three ways to create array
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
    }
}
