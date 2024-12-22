// package POTD_AC_LEAD.22-12-2024;

public class task1 {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)