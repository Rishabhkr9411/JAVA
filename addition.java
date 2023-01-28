import java.util.Scanner;

public class addition {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();

            int d = getSum(b, n1, n2);
            System.out.println(d);
        }
    }

    public static int getSum(int b, int n1, int n2) {
        int reqno = 0, c = 0, p = 1;
        int a, b1, c1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            a = n1 % 10;
            n1 = n1 / 10;
            b1 = n2 % 10;
            n2 = n2 / 10;
            c += a + b1;
            c = c / b;
            c1 = c % b;
            reqno += c1 * p;
            p = p * 10;

        }
        return reqno;
    }
}
