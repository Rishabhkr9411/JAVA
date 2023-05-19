import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int nb = sc.nextInt();
        pattern1(5);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            // when one row is printed , print new line
            System.out.println();
        }
    }
}
