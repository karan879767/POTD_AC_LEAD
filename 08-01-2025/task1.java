// LeetCode : Find nth root of m
// Time Complexity : O(log(m * n))
// Space comlecity : O(1)

public class task1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int start = 0, end = row * col - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midRow = mid / col;
            int midCol = mid % col;
            if(matrix[midRow][midCol] == target){
                return true;
            }else if(matrix[midRow][midCol] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
