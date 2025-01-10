// LeetCode : 162
//Time Complexity : O(log(n))
//Space Complexity : O(1)
public class task1 {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
