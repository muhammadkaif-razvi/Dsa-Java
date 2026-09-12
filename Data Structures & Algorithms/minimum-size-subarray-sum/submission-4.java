class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0,total = 0;
        int res = Integer.MAX_VALUE;
        for(int r = 0;r<nums.length;r++){
            total+=nums[r];
            while(total >= target){
                total -= nums[l];
                res = Math.min(res,r-l+1);
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}