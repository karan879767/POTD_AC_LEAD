// package POTD_AC_LEAD.22-12-2024;

public class task2 {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                ans++;
            }
        }
        return ans;
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)