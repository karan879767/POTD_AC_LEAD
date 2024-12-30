// CSES : Trailing Zero
// Time complexity : O(n)
// Space complexity : O(1)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class task2{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(sc.readLine());
        int count = 0;
        for(int i = 5; i <= n; i = i * 5 ){
            count = count + n / i;
        }
        System.out.println(count);
        sc.close();
    }
