import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the target ");
        int target = in.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
        // if -1 exist IN the answer then use Integer.MAX_VALUE;
    }
}
