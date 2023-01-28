
import java.util.Scanner;

public class tt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of arr");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println(" enter the arr element");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println("enter the num");
        int num = in.nextInt();
        System.out.println("enter the diff");
        int diff = in.nextInt();
        int findcount = findCount(arr, length, num, diff);
        System.out.println("count is " + findcount);

    }

    static int findCount(int arr[], int length, int num, int diff) {
        int count = 0;
        int find;
        for (int i = 0; i < length; i++) {
            find = num - arr[i];
            if (find <= diff) {
                count++;
            }

        }
        return count;

    }
}

class tt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num1,num2 ;
        System.out.println(" enter the n");
        int num1 = sc.nextInt();
        System.out.println("enter the m");
        int num2 = sc.nextInt();
        int result = differenceofsum(num1, num2);
        System.out.println("diff " + result);
    }

    static int differenceofsum(int n, int m) {
        int diff;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n != 0) {
                sum1 = i + sum1;
            } else if (i % n == 0) {
                sum2 = i + sum2;
            }

        }
        diff = sum1 - sum2;
        if (diff < 0) {
            return diff * (-1);
        }

        return diff;
    }
}

class candy {
    public static void main(String[] args) {
        int[] ratings = { 1, 2, 87, 87, 87, 2, 1 };
        System.out.println(counting(ratings));

    }

    static int counting(int[] ratings) {
        int[] candies = new int[ratings.length];
        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            candies[i] = 1;
        }
        if (ratings[0] > ratings[1]) {
            candies[0] = candies[0] + 1;

        }
        for (int i = 1; i < ratings.length - 1; i++) {
            if (ratings[i - 1] < ratings[i]) {
                candies[i] = candies[i - 1] + 1;
            } else if (ratings[i] > ratings[i + 1]) {
                candies[i] += 1;
            }
        }

        if (ratings[ratings.length - 2] < ratings[ratings.length - 1]) {
            candies[ratings.length - 1] = candies[ratings.length - 2] + 1;

        }
        for (int i = 0; i < candies.length; i++) {
            sum += candies[i];
        }
        return sum;
    }
}