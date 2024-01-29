class MyQueue {
    private Stack<Integer> StackOne;
    private Stack<Integer> StackTwo;

    public MyQueue() {
        StackOne=new Stack<>();
        StackTwo=new Stack<>();
    }
    
    public void push(int x) {
        StackOne.push(x);
        
    }
    private void transfer(){
        while(!StackOne.isEmpty()){
            StackTwo.push(StackOne.pop());
        }
    }
    
    public int pop() {
        if(StackTwo.isEmpty()){
            if(StackOne.isEmpty()){
                return -1;
            }
            else{
                transfer();
                return StackTwo.pop();
            }
        }
        else{
            return StackTwo.pop();
        }
       
    }
    
    public int peek() {
        if(StackOne.isEmpty() && StackTwo.isEmpty()){
           return -1; 
        }
        else if(StackTwo.isEmpty() && !StackOne.isEmpty()){
            transfer();
            return StackTwo.peek();
        }
        else{
            return StackTwo.peek();
        }
        
    }
    
    public boolean empty() {
        return StackOne.isEmpty() && StackTwo.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */