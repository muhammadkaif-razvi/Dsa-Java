class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String val : operations){
            if(val.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if(val.equals("C")){
                stack.pop();
            }else if(val.equals("D")){
                int tX = stack.peek() *  2;
                stack.push(tX);
            }else {
                stack.push(Integer.valueOf(val));
            }
        }
        int sum = 0;
        for(int score:stack){
            sum += score;
        }
        return sum;
    }
}