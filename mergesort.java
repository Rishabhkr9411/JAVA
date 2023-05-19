import java.util.Arrays;

//complexity  -> O(n*logn)
public class mergesort {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 77 };
        int[] arr2 = { 4, 3, 6, 44, 778 };
        int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] ans = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;

    }
}
