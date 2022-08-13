public class Practice2 {
    public static void main(String[] args) {
        int [] marks;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 60;
        marks[3] = 40;
        marks[4] = 20;
        System.out.println("Length of array : ");
        System.out.println(marks.length);
        // System.out.println(mark[3]);

        System.out.println("Content of array : ");
        for (int i=0; i<marks.length; i++){
                System.out.println(marks[i]);
            }

        System.out.println("Content of array in reverse order : ");
        for (int i=marks.length-1; i>=0; i--){ // Array is from 0 to (n-1)
            System.out.println(marks[i]);
        }
    }
}
