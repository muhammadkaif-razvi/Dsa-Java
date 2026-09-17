class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(char c:t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0) + 1);
        }
        int need = countT.size();
        int have = 0;
        int res = Integer.MAX_VALUE;
        int arr[] = {-1,-1};
        int l = 0;
        for(int r = 0;r < s.length();r++){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))){
                have++;
            }
            while(have == need){
                if((r-l+1) < res){
                    res = r-l+1;
                    arr[0] = l;
                    arr[1] = r;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar,window.get(leftChar) - 1);
                if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)){
                    have--;
                }
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? "": s.substring(arr[0],arr[1]+1);
    }
}
