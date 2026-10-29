class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        for(int x :nums){
            l = Math.max(l,x);
            r += x;
        }
        int ans = r;
        while(l<=r){
            int m = l + (r-l)/2;
            if(canSplit(nums,k,m)){
                ans = m;
                r = m -1;
            }else {
                l = m +1;
            }
        }
        return ans;
    }
    private boolean canSplit(int[] nums,int k,int limit){
        int parts = 1,cur = 0;
        for(int x:nums){
            if(cur + x > limit){
                parts++;
                cur = 0;
            }
            cur += x;
        }
        return parts <= k;
    }
}