// Leetcode : 2022
// Time Complexity : O(m * n)
// Space Complexity : O(m * n)
class task1{
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] twoDArray = new int[m][n];
        int index = 0, size = original.length;
        if((m == 1 && n == 1 && size > 1) || (m * n != size)){
            return new int[0][0];
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                twoDArray[i][j] = original[index++];
            }
        }
        return twoDArray;
    }
}