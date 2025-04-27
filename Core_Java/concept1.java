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

        // defining jagged array
        int arr1[][] = new int[3][];

        // defining length of each array or row which is variable of jagged array.
        arr1[0] = new int[3];
        arr1[1] = new int[4];
        arr1[2] = new int[2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : arr1) {
            for (int x : n) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // defifnig three dimensional array
        int arr2[][][] = new int[3][4][5];

        // filling random values in three dimensional array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    arr2[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }

        for (int n[][] : arr2) {
            for (int x[] : n) {
                for (int y : x) {
                    System.out.print(y + ",");
                }
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
