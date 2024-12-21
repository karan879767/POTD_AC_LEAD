class Solution {
    public int scoreOfString(String s) {
        int ch1 = 0, ch2 = 0;
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            ch1 = (int)s.charAt(i - 1);
            ch2 = (int)s.charAt(i);
            sum += Math.abs(ch1 - ch2);
        }
        return sum;
    }
}
// Time Complexity = O(N);
// Space Complexity = O(1);