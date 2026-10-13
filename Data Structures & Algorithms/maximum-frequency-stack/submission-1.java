class FreqStack {
    private Map<Integer,Integer> count  = new HashMap<>();
    private Map<Integer,Deque<Integer>> group = new HashMap<>();
    private int maxFreq = 0;
  
    
    public void push(int val) {
        int f = count.merge(val, 1, Integer::sum);
        maxFreq = Math.max(f,maxFreq);
        group.computeIfAbsent(f,k -> new ArrayDeque<>()).push(val);
    }
    
    public int pop() {
        Deque<Integer> s = group.get(maxFreq);
        int val = s.pop();
        count.merge(val,-1,Integer::sum);
        if(s.isEmpty()) {
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */