package Advance_Java;

import java.util.List;
import java.util.Arrays;

public class concept14 {
    // method refrencing is giving function as input to another function and have to
    // mention which class this input function belongs
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prasad", "Sakshi", "Sagar");

        List<String> unames = names.stream()
                .map(String::toUpperCase)
                .toList();

        unames.forEach(System.out::println);
    }
}
