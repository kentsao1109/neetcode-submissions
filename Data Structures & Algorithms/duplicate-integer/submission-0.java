class Solution {
    // brute force
    public boolean hasDuplicate(int[] nums) {
        for(int x = 0; x < nums.length; x++){
            int compare = nums[x];
            for(int y = x + 1; y < nums.length; y++){
                if(compare == nums[y]){
                    return true;
                }
            }
        }
        return false;
    }
}