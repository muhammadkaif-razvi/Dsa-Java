class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0,r = 0;
        for(int w:weights){
            l = Math.max(l,w);
            r += w;
        }
        int ans = r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(canShip(weights,days,mid)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    private boolean canShip(int[] weights,int days,int cap){
        int need = 1,load = 0;
        for(int w:weights){
            if(load+w>cap){
                need++;
                load = 0;
            }
            load += w;
        }
        return need <= days;
    }

}