// GFG : Find nth root of m
// Time Complexity : 
// Space comlecity :

public class task2 {
    public int nthRoot(int n, int m) {
        if( n == 1 ) return m;
        int start = 1, end = m;
        while(start <= end){
            int mid = start + (end - start)/2;
            double power = Math.pow(mid, n);
            if(power == m){
                return mid;
            }else if(power < m){
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return -1;
    }
}
