class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a:asteroids){
            
            while(!stack.isEmpty() && stack.peek() > 0 && a < 0){
                int sum = stack.peek() + a;
                if(sum < 0){
                    stack.pop();
                }else if(sum > 0){
                    a = 0;
                }else{
                    a= 0;
                    stack.pop();
                }
            }
            if(a!=0) {
                stack.push(a);
            }
            
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}