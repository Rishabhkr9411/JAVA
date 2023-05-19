import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {

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

class MagicNumber {// amazon question
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int n = sc.nextInt();
            System.out.println(Magic(n));
        }
    }

    static int Magic(int n) {
        int count = 0;
        int b = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            count += last * b;
            b = b * 5;
        }
        return count;
    }
}

class NumofDigit {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;// formula to find the number of digit in a number
        System.out.println(ans);
    }
}

class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("Sum of nth " + " " + row(n));

    }

    static int row(int n) {
        int ans = (1 << (n - 1));
        return ans;
    }
}

class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}

class power {
    public static void main(String[] args) {

    }
}

class setbits {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(set(n));
    }

    private static int set(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= n & -n;// repeat this method timing 1:56 of bitwise video
        }
        return count;
    }
}

class rangeXor {
    public static void main(String[] args) {
        // range xor for a, b = xor(b) ^ xor(a-1)
        int a = 3;
        int b = 7;

        int ans = xor(b) ^ xor(a - 1);

        System.out.println(ans);

        // only for check, will give TLE for large numbers
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }

        System.out.println(ans2);
    }

    // this gives xor from 0 to a
    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }

        if (a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }

}
