package Advance_Java;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class concept13 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Prasad", "Laxmi", "Pooja", "Viki");

        // optionsl class is used to handle case when we don't find required value in
        // collection
        Optional<String> found = name.stream()
                .filter(i -> i.contains("x"))
                .findFirst();

        System.out.println(found.orElse("Not Found"));

        // we can also handle same case using orElse() method .
        String found1 = name.stream()
                .filter(i -> i.contains("x"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(found1);
    }
}
