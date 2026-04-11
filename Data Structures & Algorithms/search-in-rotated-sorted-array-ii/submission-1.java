class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l<=r){
            int m = l +(r-l)/2;
            if(target == nums[m]) return true;
            // left sorted array
            if(nums[m] > nums[l]){
                if(target >= nums[l] && target < nums[m]){
                    r = m - 1;
                }else {
                    l = m + 1;
                }
            }else if(nums[l] > nums[m]) {
                // right sorted array
                if(target < nums[r] && target > nums[m]){
                    l = m + 1;
                }else{
                    r = m -1;
                }
            }else{
                l++;
            }
        }
        return false;
    }
}