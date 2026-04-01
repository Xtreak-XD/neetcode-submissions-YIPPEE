class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;

        Stack<Integer> stack = new Stack<>();

        for (String s : tokens){
            int a = 0;
            int b = 0;
            switch (s){
                case "+":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a * b);
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;
                default:
                    int add = Integer.parseInt(s);
                    stack.push(add);
            }
        }
        return stack.pop();
    }
}
    
