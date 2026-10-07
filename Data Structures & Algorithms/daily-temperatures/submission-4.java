class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0;i<temperatures.length;i++){
    
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()[1]]){
               int[] pair = stack.pop();
               res[pair[1]] = i - pair[1];
            }
            
            stack.push(new int[]{temperatures[i],i});
        }
        return res;
    }
}
