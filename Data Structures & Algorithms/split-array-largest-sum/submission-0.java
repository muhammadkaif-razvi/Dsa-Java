class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0,r = 0,res = 0;
        for(int num:nums){
            l = Math.max(num,l);
            r += num;
        }
        res = r;

        while(l<=r){
            int m = l +(r-l)/2;
            if(canSplit(nums,k,m)){
                res = m;
                r = m - 1;
            }else{
                l = m+1;
            }
        }
        return res;
    }
    public boolean canSplit(int[] nums, int k ,int largest){
        int currSum = 0,subArray = 1;
        for(int num:nums){
            currSum += num;
            if(currSum > largest){
                subArray++;
                if(subArray > k) return false;
                currSum = num;
            }
        }
        return true;
    }
}