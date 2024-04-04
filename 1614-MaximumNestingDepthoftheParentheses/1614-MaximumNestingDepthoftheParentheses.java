class Solution {
    public int maxDepth(String s) {
       int res=0;
       int depth=0;
       for(char x:s.toCharArray()){
        if(x=='('){
            depth++;
        }
        if(x==')'){
            depth--;
        }
        res=Math.max(depth,res);
       } 
       return res;
    }
}
"(1+(2*3)+((8)/4))+1"
