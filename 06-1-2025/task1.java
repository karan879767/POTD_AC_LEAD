// GFG : Floor in a Sorted Array
// Time Complexity : O(n)
// Space Complexity : O(1)

public class task1 {
    static int findFloor(int[] arr, int k) {
        int element = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= k){
                element = Math.max(element, i);
            }
        }
        return element;
    }
}