class Solution {
    public String removeKdigits(String num, int k) {
        int len=num.length();
        if(len==k)return "0";
        if(k==0) return num;

        Stack<Character>st=new Stack<>();
        int index=0;
        while(index<len){
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(index)){
                st.pop();
                k--;
            }
            st.push(num.charAt(index++));
        }
        while(k-->0){
             
            st.pop();
           
        }
        String res="";
        while(!st.isEmpty())res=st.pop()+res;
        while(res.length()>1 &&res.charAt(0)=='0'){
            res=res.substring(1,res.length());
        }
"1432219"
