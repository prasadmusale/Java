package Advance_Java;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
//comparable is in lang package so no need to import it .

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // have to override toString method which prints object name and thrit hashcode
    @Override
    public String toString() {
        return "Student [ " + name + " : " + age + "]";
    }

    // we have to override compareTo method in comparable inteface it is not
    // functional interface so can't use lambsa expression
    @Override
    public int compareTo(Student that) {
        return this.age > that.age ? 1 : -1;
    }
}

// code to implement comparator and comparable .
// comparator gives us way to use our own logic to sort the collection
public class concept10 {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();

        obj.add(34);
        obj.add(78);
        obj.add(67);
        obj.add(56);

        // collections is utility class so we can use his methods but can't define
        // objects of its type
        Collections.sort(obj);

        System.out.println(obj);

        List<Integer> obj1 = new ArrayList<>();

        obj1.add(45);
        obj1.add(12);
        obj1.add(90);
        obj1.add(19);

        // comparator is interface
        // Implemented our own logic for sorting collection i.e sorted integers by their
        // last digit .
        // we have to onerride compare methd and have to write our own logic their for
        // sorting
        Comparator<Integer> com = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(obj1, com);

        System.out.println(obj1);

        // sorted students objects according to their age and implemented lambda
        // expression as Comparator is functional interface .

        List<Student> obj2 = new ArrayList<>();

        obj2.add(new Student("Prasad", 23));
        obj2.add(new Student("Sakshi", 12));
        obj2.add(new Student("Sagar", 68));
        obj2.add(new Student("Manish", 56));

        System.out.println(obj2);

        Comparator<Student> com1 = (Student i, Student j) -> Integer.compare(i.age, j.age);

        Collections.sort(obj2, com1);
        System.out.println(obj2);

        // Here we have create new Student object list and sorted it using comparable
        // interface having method compareTo , by overridding it in student class

        List<Student> obj3 = new ArrayList<>();

        obj3.add(new Student("Shrey", 34));
        obj3.add(new Student("Sakshi", 67));
        obj3.add(new Student("Viki", 12));
        obj3.add(new Student("tau", 79));

        System.out.println(obj3);

        // so when we use this sort method it has used our logic written in compareTo
        // method
        Collections.sort(obj3);

        System.out.println(obj3);

    }

}
