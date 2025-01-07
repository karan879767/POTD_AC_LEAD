// package POTD_AC_LEAD.21-12-2024;

public class GCD {
    class Solution {
        public int gcd(int a, int b) {
            // code here
            while(b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
      };
      // Time Complexity = O(log(min(a,b)));
      // space Complexity = O(1); 
}
