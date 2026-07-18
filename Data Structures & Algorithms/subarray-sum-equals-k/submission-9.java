class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0,cur = 0;
        Map<Integer,Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        for(int num:nums){
            cur += num;
            int diff = cur -k;
            res += prefixSum.getOrDefault(diff,0);
            prefixSum.put(cur,prefixSum.getOrDefault(cur,0)+1);
        }
        return res;
    }
}