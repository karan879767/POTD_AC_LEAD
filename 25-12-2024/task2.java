// Codeforces
// Time complexity : O(n)
// Space complexity : O(1)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task2 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
        String[] input = reader.readLine().split(" "); 
        int n = Integer.parseInt(input[0]);
        int time = Integer.parseInt(input[1]);
        int TotalContestTime = 240;
        int usedTime = time;
        int problem = 0;
 
        for (int i = 1; i <= n; i++) {
            int ContestTime = i * 5;
            if(usedTime + ContestTime > TotalContestTime ){
                break;
            }
            usedTime += ContestTime;
            problem++;
        }
        System.out.println(problem);
        reader.close();
    }
}