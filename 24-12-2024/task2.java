// package 24-12-2024;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task2 {
    static boolean isPangram(String s) {
        s = s.toLowerCase(); 
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!s.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(sc.readLine());
        
        String str = sc.readLine();

        if (isPangram(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
