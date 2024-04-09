class Solution {
    public boolean checkValidString(String s) {
        int low=0;

        for(char c:s.toCharArray()){
            if(c=='(' || c=='*'){
                    low++;
            }
            
            else{
                low--;
            }
            if(low<0){
                return false;
            }

        }   
        if(low==0)return true;
        int high=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==')'||c=='*'){
                high++;

            }
"()"
