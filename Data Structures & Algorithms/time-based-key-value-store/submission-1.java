class TimeMap {
    private Map<String,List<Pair>> map = new HashMap<>();
    private static class Pair {
        int ts;
        String val;
        Pair(int ts,String val){
            this.ts = ts;
            this.val = val;
        }
    }
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
       map.computeIfAbsent(key,k -> new ArrayList<>()).add(new Pair(timestamp,value)); 
    }
    
    public String get(String key, int timestamp) {
        List<Pair> list = map.get(key);
        if(list == null) return "";
        int l = 0,r = list.size()-1;
        String ans = "";
        while(l<=r){
            int m = l +(r-l)/2;
            if(list.get(m).ts <= timestamp){
                ans = list.get(m).val;
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return ans;
    }
}
