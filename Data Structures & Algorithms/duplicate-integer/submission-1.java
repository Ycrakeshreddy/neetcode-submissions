class Solution {
    public boolean hasDuplicate(int[] nums) {
        
            Set <Integer> seen =  new HashSet<>();

              int len = nums.length;

            for(int i=0;i<len;i++) {

                seen.add(nums[i]);
            }
            int len1 = seen.size();

            if(len1 == len)
            return false;

            else
            return true;


    }
}