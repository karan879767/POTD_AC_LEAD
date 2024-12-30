// Leetcode : 1689
// Time Complexity : O(n)
// Space Complexity : O(1)
class task2{
    public int minPartitions(String n) {
        int ans = 0;
        for (char c : n.toCharArray()) {
            int rem = c - '0';
            ans = Math.max(ans, rem);
        }
        return ans;
    }
}