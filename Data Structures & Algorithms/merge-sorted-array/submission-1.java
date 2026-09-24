class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int[] arr = new int[m+n];

        int k=0;

        for(int i=0;i<m;i++) {
            if(nums1[i] != 0){
                arr[k] = nums1[i];
                k++;
            }}

        for(int j=0;j<n;j++) {
            if(nums2[j] != 0){
                arr[k] = nums2[j];
                k++;
            }}

            Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) {
            nums1[i] = arr[i];
        }
        
        
    }
}