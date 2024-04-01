class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0 || s.equals(" "))return -1;
        s=s.trim();
        String [] sArray=s.split(" ");
        return sArray[sArray.length-1].length();

        
    }
}
"Hello World"
