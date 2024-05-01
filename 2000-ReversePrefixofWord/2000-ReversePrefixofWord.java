class Solution {
    public String reversePrefix(String word, char ch) {
            if(word.length()==0)return "";
            int index=0;
            
            for(int i=0;i<word.length();i++){
                if(ch==word.charAt(i)){
                    index=i;
                    break;
                }
            }
            String afterReverse=reverse(word.substring(0,index+1));
            String afterIndex=word.substring(index+1,word.length());
            return afterReverse+afterIndex;

    }
    private String reverse(String word){
        if(word.length()==1)return word;
       
        String res="";
        for(int i=word.length()-1;i>=0;i--){
                res+=word.charAt(i);

        }
        return res;
"abcdefd"
