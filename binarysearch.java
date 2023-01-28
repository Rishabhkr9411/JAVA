//import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int target;
        int[] arr = { -22, 0, 2, 3, 6, 78, 90 };
        target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int mid;
        int end = arr.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        // return end + 1; both give same result
        return arr[start];// for ceiling value
        // return end; for floor value
    }

}
