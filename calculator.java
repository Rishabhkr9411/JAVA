import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("enter the operator");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.println("enter two number");
                int numb1 = in.nextInt();
                int numb2 = in.nextInt();
                if (op == '+') {
                    ans = numb1 + numb2;
                }
                if (op == '-') {
                    ans = numb1 - numb2;
                }
                if (op == '/') {
                    ans = numb1 / numb2;
                }
                if (op == '*') {
                    ans = numb1 * numb2;
                }
                if (op == '%') {
                    ans = numb1 % numb2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }
}
