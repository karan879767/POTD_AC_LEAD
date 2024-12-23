// package POTD_AC_LEAD.23-12-2024;

public class task1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int j = 0; j < nums.length; j++){
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if((nums[j] > nums[i]) && (i != j)){
                    count++;
                }
            }
            arr[j] = count;
        }
        return arr;
    }
}
