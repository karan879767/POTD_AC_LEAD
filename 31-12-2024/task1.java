// Leetcode : 151
// Time Complexity : O(n)
// Spcae Complexity : O(n)

class task1{
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder revString = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            revString.append(words[i]);
            if (i > 0) {
                revString.append(" ");
            }
        }
        return revString.toString();
    }
}