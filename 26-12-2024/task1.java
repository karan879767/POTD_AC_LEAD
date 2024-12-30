// leetcode : 2125
// Time complexity : O(n)
// Space complexity : O(1)

class task1{
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> ans = new ArrayList<>();
        int result = 0;
        for(String row : bank){
            int count = 0;
            for (char ch : row.toCharArray()) {
                if (ch == '1') {
                    count++;
                }
            }
            if( count > 0){
                ans.add(count);
            }
        }
        if (ans.size() == 0) {
            return 0;
        }
        for(int i = 1; i < ans.size(); i++){
            result += ans.get(i - 1) * ans.get(i);
        }
        return result;
    }
}