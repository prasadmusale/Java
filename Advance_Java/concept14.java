package Advance_Java;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Students { " + name + " : " + age + "}");
    }
}

public class concept14 {
    // method refrencing is giving function as input to another function and have to
    // mention which class this input function belongs
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prasad", "Sakshi", "Sagar");

        // Implementing method refrencing
        List<String> unames = names.stream()
                .map(String::toUpperCase)
                .toList();

        unames.forEach(System.out::println);

        // constructor refrencing means giving constructor as input to method
        List<Student> students = names.stream()
                .map(Student::new)
                .toList();

        for (Student s : students) {
            System.out.println(s);
        }

    }
}
