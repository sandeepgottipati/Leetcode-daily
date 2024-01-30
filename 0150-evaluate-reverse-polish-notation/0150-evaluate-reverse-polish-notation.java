class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(String str:tokens){
          
          
                    switch(str){
                        case "*":
                            st.push(st.pop()*st.pop());
                            break;
                        case "+":
                            st.push(st.pop()+st.pop());
                            break;
                        case "-":
                          
                            st.push(-st.pop()+st.pop());
                            break;
                        case "/": 
                            int valOne=st.pop();int valTwo=st.pop();
                            st.push(valTwo/valOne);
                            break;
                        default:
                            st.push(Integer.parseInt(str));
                    }
                }
            return st.pop();
        }
    }
