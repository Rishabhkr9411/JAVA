import java.util.Scanner;

public class MethodPractice {

    static void update(int A[]) {
        A[0] = 25;
    }

    static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        // int a = 10, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = max(a, b);
        System.out.println(c);
    }

}
