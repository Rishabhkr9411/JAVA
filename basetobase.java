import java.util.Scanner;

public class basetobase {
    public static void main(String[] args) {
        int n, b1, b2;
        try (Scanner ris = new Scanner(System.in)) {
            System.out.println("Enter the number  ");
            n = ris.nextInt();
            System.out.println("Enter the  base1 ");
            b1 = ris.nextInt();
            System.out.println("Enter the base2 ");
            b2 = ris.nextInt();
        }
        int d = getvalue(n, b1, b2);
        System.out.println(d);
    }

    public static int getvalue(int n, int b1, int b2) {
        int firstno = valueintodecimal(n, b1);
        int reqno = valueintobase(firstno, b2);
        return reqno;

    }

    public static int valueintodecimal(int n, int b) {
        int p = 1, sum = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            sum += r * p;
            p = p * b;
        }
        return sum;
    }

    public static int valueintobase(int n, int b) {
        int p = 1, sab = 0;
        while (n > 0) {
            int r = n % b;
            n = n / b;
            sab += r * p;
            p = p * 10;

        }
        return sab;

    }

}
