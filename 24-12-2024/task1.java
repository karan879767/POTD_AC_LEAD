// package 24-12-2024;

public class task1 {
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = 0;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
