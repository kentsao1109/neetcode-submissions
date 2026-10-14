class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>(nums.length);
        for(int x = 0; x < nums.length; x++){
            if(!numsSet.add(nums[x])){
                return true;
            }
        }
        return false;

    }
}