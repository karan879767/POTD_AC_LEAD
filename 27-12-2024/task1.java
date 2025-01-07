// Leetcode : 202
// Time complexity : O(n)
// Space complexity : O(1)
import java.util.HashSet;
import java.util.Set;

class task1{
    public int SquareNumber(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
   }
    public boolean isHappy(int n) { 
        Set<Integer> nums = new HashSet<>();
        while(n != 0 && !nums.contains(n)){
            nums.add(n);
            n = SquareNumber(n);
        }
        return n == 1;
    }
}