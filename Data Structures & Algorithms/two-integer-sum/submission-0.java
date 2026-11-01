class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int r = 0; r < nums.length; r++){
            for(int c = r+1; c < nums.length; c++){
                if(nums[c] + nums[r] == target){
                    answer[0] = r;
                    answer[1] = c;
                }
            }
        }
        return answer;
    }
}
