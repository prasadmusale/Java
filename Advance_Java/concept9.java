package Advance_Java;

//importing ArrayList and List collectiion classses .
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class concept9 {

    public static void main(String[] args) {

        // ArrayList Collection class with Collection interface object type
        Collection<Integer> num = new ArrayList<Integer>();

        num.add(2);
        num.add(5);
        num.add(7);
        num.add(6);

        System.out.println(num);

        // ArrayList Collection class with List interface object type
        List<Integer> num1 = new ArrayList<Integer>();

        num1.add(1);
        num1.add(2);
        num1.add(67);
        num1.add(56);

        System.out.println(num1.indexOf(67));

        // HashSet collection class with Set interface object type

        Set<Integer> num2 = new HashSet<Integer>();

        num2.add(4);
        num2.add(98);
        num2.add(98);
        num2.add(65);
        num2.add(34);

        // HashSet stores all non duplicate values in unordered format
        for (int i : num2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // TreeSet collection class with Set interface object type .
        // TreeSet collection stores values in ascending order .
        Set<Integer> num3 = new TreeSet<Integer>();

        num3.add(23);
        num3.add(56);
        num3.add(12);
        num3.add(70);

        // Iterator is interface which has method iterator which helps to iterate
        // through collection
        Iterator<Integer> values = num3.iterator();

        while (values.hasNext()) {
            System.out.print(values.next() + " ");

        }

    }
}
