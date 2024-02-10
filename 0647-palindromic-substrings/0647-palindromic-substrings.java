class Solution {
    public int countSubstrings(String s) {
        int totalcount=0;
        for(int i=0;i<s.length();i++){
            totalcount+=getPalindromicSubString(i,i,s);
            totalcount+=getPalindromicSubString(i,i+1,s);
        }
        return totalcount;
    }
    private int getPalindromicSubString(int start,int end,String s){
        int currCount=0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            currCount++;
            start--;
            end++;
        }
        return currCount;
    }
}