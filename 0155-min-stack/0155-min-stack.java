class MinStack {
Stack<Integer> st;
    Stack<Integer> minStack;
    int min;
    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty() && minStack.isEmpty()){
            st.push(val);
            minStack.push(val);
            min=val;
            
        }
        else if(val<=min){
            st.push(val);
            minStack.push(val);
            min=val;
        }
        else{
            st.push(val);
        }
    }
    
    public void pop() {
    if(st.isEmpty()){
        return;
    }    
    else{
        if(min==st.peek()){
            st.pop();
            minStack.pop();
            if(!minStack.isEmpty())min=minStack.peek();
            
        }
        else{
            st.pop();
            
        }
    }
    }
    
    public int top() {
        if(!st.isEmpty()){return st.peek();}
    return -1;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */