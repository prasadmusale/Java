package Advance_Java;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class concept12 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10000);

        Random ran = new Random();

        int size = 10000;
        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        // System.out.println(nums);

        long reg_stream = System.currentTimeMillis();
        int sum = nums.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                    return n * 2;
                })
                .reduce(0, (c, e) -> (c + e));
        long reg_stream__after = System.currentTimeMillis();

        long par_stream = System.currentTimeMillis();
        int sum1 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                    return n * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long par_stream_after = System.currentTimeMillis();

        System.out.println(sum + " , " + sum1);
        System.out.println(reg_stream__after - reg_stream);
        System.out.println(par_stream_after - par_stream);

    }
}
