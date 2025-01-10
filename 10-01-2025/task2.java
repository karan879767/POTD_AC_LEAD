// LeetCode : Q:81

public class task2 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return true;

            if(nums[start] <= nums[mid]){
                if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                    start = start + 1;
                    end = end - 1;
                }
                else if(nums[start] <= target && nums[mid] >= target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(nums[mid] <= target && nums[end] >= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
