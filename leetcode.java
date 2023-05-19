public class leetcode {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = { -1, -1 };
            int start = search(nums, target, true);
            int end = search(nums, target, false);
            ans[0] = start;
            ans[1] = end;
            return ans;
        }

        int search(int[] nums, int target, boolean isTrue) {
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    if (isTrue) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }
}

class jump {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        boolean ans = canJump(arr);

        System.out.println(ans);

    }

    static boolean canJump(int[] nums) {
        int i = 0;
        if (nums[0] >= nums.length) {
            return true;
        }
        while (i < nums.length) {
            int maxsum = nums[i] + nums[nums[i]];
            if (maxsum < nums.length) {
                i = nums[i];
            } else if (maxsum >= nums.length) {
                return true;
            }
        }
        return false;
    }
}
