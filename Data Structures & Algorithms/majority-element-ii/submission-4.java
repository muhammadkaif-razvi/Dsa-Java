class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int n:nums){
                map.put(n,map.getOrDefault(n,0)+1);
    
                if(map.get(n) > nums.length/3 && !res.contains(n)){
                res.add(n);
                }
            
        
        }
        return res;
    }
}