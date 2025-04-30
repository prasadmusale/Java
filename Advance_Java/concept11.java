package Advance_Java;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class concept11 {
    public static void main(String[] args) {
        // Another way of creating ArrayList using method of array class
        List<Integer> num = Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1);

        System.out.println(num);

        // displaying all values of collection using for each method
        num.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // converting arraylist collection to stream
        Stream<Integer> st = num.stream();
        st.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> st1 = num.stream();

        // applying filter method on stream
        Stream<Integer> st2 = st1.filter(n -> n % 2 == 0);

        // applying map method to replace each value of collection with our operation on
        // that value
        Stream<Integer> st3 = st2.map(n -> n * 2);

        // sorting stream in ascending order
        Stream<Integer> st4 = st3.sorted();

        // reducing stream using our logic i.e. c-e
        int result = st4.reduce(0, (c, e) -> c - e);

        System.out.println(result);

    }
}
