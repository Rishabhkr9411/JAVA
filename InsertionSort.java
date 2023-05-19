import java.util.Arrays;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 94, 92, 76, 75, 90 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                } else {
                    break;
                }

            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

class merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        int[] ans = new int[m + n];
        for (int i = 0; i < m; i++) {
            ans[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            ans[m + i] = nums2[i];
        }
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
        // for (int i = 0; i < ans.length - 1; i++) {
        // for (int j = i + 1; j > 0; j--) {
        // if (ans[j] < ans[j - 1]) {
        // int temp = ans[j];
        // ans[j - 1] = ans[j];
        // ans[j - 1] = temp;

        // }

        // }
        // }
        System.out.println(Arrays.toString(ans));
    }
}