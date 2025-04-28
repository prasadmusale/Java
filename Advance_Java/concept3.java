package Advance_Java;

//implementing lambda expression

interface calculator {
    int add(int a, int b);
}

public class concept3 {
    public static void main(String args[]) {
        calculator cal = (x, y) -> (x + y);

        System.out.println(cal.add(5, 10));

    }
}
