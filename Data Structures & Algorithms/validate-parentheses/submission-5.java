class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '(' ||
               c == '{' || 
               c == '['){
                stack.push(c);
               }else{
                if(stack.isEmpty()) return false;
                char t = stack.pop();
                if(c == ')' && t != '(' ||
                   c == '}' && t != '{' ||
                   c == ']' && t != '['){
                    return false;
                   }                
               }
        }
        return stack.isEmpty();
    }
}
