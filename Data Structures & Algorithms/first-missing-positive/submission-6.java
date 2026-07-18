class Solution {
    public int firstMissingPositive(int[] nums) {
        int res = 1;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
       while(set.contains(res)){
        res++;
       }
       return res;
    }
}