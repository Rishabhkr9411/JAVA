import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Scanner;

class arrays {

    public static void main(String[] args) {
        // datatype[] variable_name =new datatype[size]
        // int[] rnos = new int[5];
        // or directly
        int[] rnos2 = { 12, 23, 23 };
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }

}

class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}

class array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // if (arr[j] == arr[i]) {
                for (int k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        i++;
                    }
                }
                if (arr[i] == arr[j]) {
                    count++;
                }

                // System.out.println();

            }
            System.out.println(arr[i] + " " + count);

        }

    }
    // System.out.println(i + "" + count);
}
