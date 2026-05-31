class Solution {
    public int search(int[] nums, int target) {
        int l = 0,r = nums.length-1;

        while(l<=r){
            int m = l + (r-l)/2;
            int val = nums[m];
            if(val < target){
                l = m + 1;
            }else if(val > target){
                r = m - 1;
            }else {
                return m;
            }
        }
        return -1;
    }
}
