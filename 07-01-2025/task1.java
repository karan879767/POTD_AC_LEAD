// LeetCode : 441
public class task1 {
    public int arrangeCoins(int n) {
        int start = 1, end = Integer.MAX_VALUE;
        int store = 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sum = (long) mid * (mid + 1) / 2;
            if(sum == n){
                return mid;
            }else if( sum < n){
                store = Math.max(store, mid);
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return store;
    }
}
