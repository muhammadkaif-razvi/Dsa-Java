class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1,r = nums.length;
        for(int i = 1;i<r;i++){
            if(nums[i] != nums[i-1]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}