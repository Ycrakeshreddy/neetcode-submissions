class Solution {
    public int[] replaceElements(int[] arr) {

        int max = -1;

        int n = arr.length-1;

        for(int i=n;i>=0;i--){

            int c = arr[i];

            arr[i] = max;

            max = Math.max(max,c);
        }

        return arr;
        
    }
}