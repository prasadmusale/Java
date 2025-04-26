package Core_Java;

public class concept1 {
    public static void main(String[] args) {

        // creating two dimensional array
        int arr[][] = new int[3][4];

        // inputing random values in two dimensional array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        // printing all values of two dimensional array using for loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // printing all values of two dimensional array using enhanced for loop
        for (int n[] : arr) {
            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
