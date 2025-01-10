// LeetCode : Q:153
// Time Complexity : O(log(n));
// Space Complexity : O(1);

public class task2 {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >= nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}
