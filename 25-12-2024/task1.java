// leetcode : 2125
// Time complexity : O(n log n + m log m)
// Space complexity : O(log n + log m)

class task1{
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int iG = 0;
        int jS = 0;
        while( jS < s.length && iG < g.length){
            if(s[jS] >= g[iG]){
                iG++;
            }
            jS++;
        }
        return iG;
    }
}