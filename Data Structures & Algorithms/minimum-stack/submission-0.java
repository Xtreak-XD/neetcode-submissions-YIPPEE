class MinStack {
    private Stack<int[][]> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if (stack.isEmpty()){
            min = val;
        }else{
            min = Math.min(stack.peek()[0][1], val);
        }
        stack.push(new int[][]{{val, min}});
    }
    
    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek()[0][0];
    }
    
    public int getMin() {
        return stack.peek()[0][1];
    }
}
