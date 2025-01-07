// Leetcode Q:1769
// Time Complexity : O(n)
// Space Complexity : O(1)

public class task1 {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(boxes.charAt(i) == '1'){
                for(int j = 0; j < n; j++){
                    ans[j] += Math.abs(i - j);
                }
            }
        }
        return ans;
    }
}
