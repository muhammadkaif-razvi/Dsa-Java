class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for (int p : piles) {
            r = Math.max(r, p);
        }
        int ans = r;
        while (l <=r) {
            int k = (r - l) / 2 + l;
            long hours = 0;
            for(int p: piles){
                hours += (p +k-1) /k;
            }
            if(hours<=h){
              ans = k;
            r = k-1; 
            }else{
                l = k+1;
            }
        }
        return ans;
    }
}
