import java.util.Arrays;

public class questions {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 2 };
        int[] bobSizes = { 2, 2 };
        int[] ans = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(ans));

    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int end;
        int start;
        int count = 0;
        int[] ans = new int[2];
        int sumB = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumB += bobSizes[i];
        }
        if (sumA > sumB) {
            end = sumA;
            start = sumB;
        } else {
            end = sumB;
            start = sumA;
        }
        int mid = (start + end) / 2;
        while (start < end) {
            if (start == mid && end == mid) {
                count++;
            } else if (start < mid && end > mid) {
                start += 1;
                end = end - 1;
                count++;
            }
        }
        ans[0] = count;
        ans[1] = 2 * count;
        return ans;
    }
}
