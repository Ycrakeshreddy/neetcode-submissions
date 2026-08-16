class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            seen.add(num);
        }

        int len_seen = seen.size();

        int len_nums = nums.length;

        if(len_seen != len_nums){

            return true;
        }
        else{
            return false;
        }
  
}
}