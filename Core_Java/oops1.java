package Core_Java;

class addition {
    public int add(int a, int b) {
        return a + b;
    }
}

public class oops1 {
    public static void main(String[] args) {
        addition obj1 = new addition();

        int x = 10;
        int y = 20;

        int result = obj1.add(x, y);
        System.out.println(result);
    }
}
