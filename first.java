import java.util.Scanner;

class Calculator1

{
    public static void main(String args[]) {
        int a, b, c, d, e, f;

        System.out.println("Enter number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;
        System.out.println("product of two number is " + e);
        System.out.println("sum of two number is " + c);
        System.out.println("subtraction of two number is " + d);
        System.out.println("divison of two numberr is " + f);
        System.out.println("question solved !! ");
    }
}

class max {
    public static void main(String[] args) {
        int greatest;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        greatest = Math.max(c, Math.max(a, b));
        System.out.println(greatest);

    }
}

class Keyboard {
    public static void main(String args[])

    {
        Scanner S = new Scanner(System.in);
        String name;
        System.out.println("May I know your name ");
        name = S.nextLine();
        System.out.println("welcome in my world " + name);

    }

}

class First {
    public static void main(String args[]) {
        System.out.println(" hello world");

    }
}

class DataSizeRange {
    public static void main(String args[]) {
        System.out.println("Byte Min:" + Byte.MIN_VALUE);
        System.out.println("Byte Max:" + Byte.MAX_VALUE);
        System.out.println("Byte Bytes" + Byte.SIZE);
        System.out.println(" Integer Min:" + Integer.MIN_VALUE);
        System.out.println("Integer Max:" + Integer.MAX_VALUE);
    }
}

class Area {
    public static void main(String args[]) {
        float b, h, area, S;
        int p, q, r;
        double w;

        System.out.println("enter three sides of triangle  ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        q = sc.nextInt();
        r = sc.nextInt();
        System.out.println("Enter the base and height   ");
        b = sc.nextFloat();
        h = sc.nextFloat();
        S = (p + q + r) / 2f;
        w = Math.sqrt(S * (S - p) * (S - q) * (S - r));

        area = b * h / 2;
        System.out.println("Area of a triangle is " + area);
        System.out.println("Area of a Triangle is " + w);

    }
}

class Roots {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.println("enter values of a,b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r1 = ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        r2 = ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        System.out.println("Roots are " + r1);
        System.out.println("root is " + r2);
    }
}

class Even {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number ");
        }
    }
}

class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
        // if last digit of binary is 1 then it is an odd number
        // any number AND operation with 1 is the same number
    }
}

class findUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 6, 2, 3, 6, 1 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

class Age {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age");
        age = sc.nextInt();
        if (age >= 14 && age <= 45) {
            System.out.println("you are young ");
        } else if (age < 14) {
            System.out.println("you are a child ");

        } else if (age > 45) {
            System.out.println("you are senior citizen ");
        }

    }
}

class Sum {
    public static void main(String args[]) {
        int n, i, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            sum = i + sum;

        }
        System.out.println("Sum " + sum);
        System.out.println(n * (n + 1) / 2);
    }

}

class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n, i, result;
        n = sc.nextInt();
        if (n >= 2 && n <= 20) {
            for (i = 1; i < 11; i++) {
                result = n * i;
                System.out.println(n + " x " + i + " = " + result);

            }
        }
    }
}

class Factorial {
    public static void main(String args[]) {
        int n, fact = 1;
        int i;
        System.out.println("enter the number ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
            // System.out.println("factorial is " + fact);
        }
        System.out.println("factorial is " + fact);
    }
}

class displayDigit {
    public static void main(String[] args) {
        int n, r, count = 0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            ++count;
            System.out.println("" + r);
        }
        System.out.println(" number of digits : " + count);
    }
}

class reversePalindromeArmstrong {
    public static void main(String[] args) {
        int sum = 0, n;
        int m, r;
        int sum1 = 0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = n;
        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;// palindrome or reverse
            sum1 = sum1 + r * r * r;// for armstrong
            n = n / 10;
        }
        // n = zero nikalega
        System.out.println("reverse of the number is :" + sum);
        if (m == sum1) {
            System.out.println("it is armstrong number");

        } else {
            System.out.println(" it is not armstrong number");
        }
        if (m == sum) {
            System.out.println("it is a Palindrome");
        } else {
            System.out.println("it is not palindrome");

        }
    }
}

class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int k;
        int N;
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        System.out.println("" + a);
        System.out.println("" + b);
        for (int i = 0; i <= N - 2; i++) {
            k = a + b;
            a = b;
            b = k;
            System.out.println("" + k);
        }

    }
}

class palindromestring {
    public static void main(String[] args) {
        String A;
        String rev = "", B;
        System.out.println("enter the word");
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        int n = A.length();
        B = A;
        for (int i = 0; i < n; i++) {
            rev = A.charAt(i) + rev;
        }
        System.out.println("reversed :" + rev);
        if (rev.equals(B)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

class pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                // System.out.print("*");
                // System.out.print(j + " ");
                // System.out.print(i + " " + j);
            }
            System.out.println(" ");
        }
    }
}

class pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}

class pattern3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                ++count;
                System.out.print(count + " ");
            }

            System.out.println(" ");
        }
    }
}

class patternKK1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class patternKK2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class patternkk3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class patternkk4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + j);
            }
            System.out.println("");
        }
    }
}

class patternkk5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class patternKK10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i + j) > 5) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

class patternKK6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

class patternKK7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

            }
        }
    }
}

class patternkk31 {
    public static void main(String[] args) {
        // pattern31(4);
        pattern32(3);

    }

    static void pattern31(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        int N = (2 * n) - 1;
        for (int row = 0; row <= N; row++) {
            for (int col = 0; col <= N; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(N - row, N - col));
                // if (atEveryIndex != 0) {
                System.out.print(atEveryIndex + " ");
                // } else {
                // break;
                // }

            }
            System.out.println();
        }
    }
}

class ArrayMultiply {
    public static void main(String args[]) throws Exception {
        int N, sum = 1;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int a[] = new int[N];
        // input array
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            // 5 sum = sum + a[j];
            sum = sum * a[j];
        }
        System.out.println(sum);
    }
}

class hello {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        switch (n) {
            case 1:
                System.out.println("one ");
                break;
            case 2:
                System.out.println("two");

            default:
                break;
        }
    }
}

class checkcase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char chc = in.next().trim().charAt(0);
        // trim to delete the space before the word
        if (chc >= 'a' && chc <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("UPPERRCASE");
        }
    }
}

class countnumbs {
    public static void main(String[] args) {
        int n = 345553;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;

            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

class fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Fruit = in.next();
        switch (Fruit) {
            case "mango":
                System.out.println("best fruit");
                break;
            case "grapes ":
                System.out.println("little fruit");
                break;
            case "orange":
                System.out.println("sour fruit");
                break;
            default:
                System.out.println("enter valid fruit");

        }
    }
}

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum1 = (a * b) + (c * d);
        System.out.println(sum1);
    }
}