package Core_Java;

public class concept4 {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a; // autoboxing i.e storing int into Wrapper class object

        System.out.println(obj);

        int b = obj; // auto-unboxing i.e vice-versa of autoboxing

        System.out.println(b);

        String str = "12";
        int c = Integer.parseInt(str);

        System.out.println(c);

    }
}
