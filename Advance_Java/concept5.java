package Advance_Java;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class concept5 {
    public static void main(String[] args) throws IOException {

        // When we use bufferedReader class main method throws IOException
        // To use bufferedReader object it need InputStreamReader class object
        // InputStramReader object also needs System.in input
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int x = Integer.parseInt(br.readLine());
        System.out.println(x);

        // Scanner is another class to take input
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        System.out.println(y);

        br.close();
        sc.close();

    }
}
