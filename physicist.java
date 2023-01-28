import java.util.Scanner;

public class physicist {
    public static void main(String[] args) {
        int n;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        // int[] R = new int[n];
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        // int A[][] = { { 1, 2, 3 }, { 23, 45, 55 }, { 22, 2, 34 } };
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
            sum1 += A[i];

        }
        for (int i = 0; i < n; i++) {
            B[i] = scn.nextInt();
            sum2 += B[i];
        }
        for (int i = 0; i < n; i++) {
            C[i] = scn.nextInt();
            sum3 += C[i];

        }
        if (sum1 == 0 && sum2 == 0 && sum3 == 0) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}
