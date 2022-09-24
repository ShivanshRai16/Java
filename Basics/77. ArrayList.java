import java.util.*;

public class Practice2{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(5);
        l1.add(3);

        l2.add(12);
        l2.add(15);
        l2.add(20);

        l1.addAll(l2);

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println("");

        System.out.println(l1.contains(25));

        System.out.println(l1.indexOf(1));

        l1.set(3, 55);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
