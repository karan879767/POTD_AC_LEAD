// LeetCode : Q35
// Time Complexity : O(log(n));
// Space Complexity : O(1);

public class task2 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        if(nums[end] < target) return n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
