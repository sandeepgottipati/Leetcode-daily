class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
/**
BRUTE FORCE:
  int res[]=new int[temperatures.length];
        int n=temperatures.length;
  
        for(int i=0;i<n;i++){
              boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(temperatures [i]<temperatures[j]){
                    if(!flag){
                   res[i]=Math.max(res[i],j-i);     
                        flag=true;
                    }
                    
                   
                }
            }
        }
        return res;


*/
        Stack<Integer> st=new Stack<>();
        int res[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty() && temperatures[i]<temperatures[st.peek()]){
                res[i]=st.peek()-i;
            }
            st.push(i);
        }
      return res;
    }
}
