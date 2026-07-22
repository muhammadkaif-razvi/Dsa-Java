class Solution {
    public boolean isPalindrome(String s) {
        int l = 0,r = s.length()-1;
        while(l<=r){
            while(!isAlphaNum(s.charAt(l)) && l<r) {
                l++;
            }
            while(!isAlphaNum(s.charAt(r)) && r>l){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isAlphaNum(char c){
        return (
            c >= '0' && c <= '9' ||
            c >= 'a' && c <= 'z' ||
            c >= 'A' && c <= 'Z'
        );
    }
}
