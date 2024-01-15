class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        int freqOne[]=new int[26];
        int freqTwo[]=new int[26];
        for(int i=0;i<word1.length();i++){
            freqOne[word1.charAt(i)-'a']++;
           
        }
        for(int i=0;i<word2.length();i++){
            freqTwo[word2.charAt(i)-'a']++;
        }
        // need to match whether the character is present in both strings.
        for(int i=0;i<26;i++){
            if((freqOne[i]==0) !=(freqTwo[i]==0)){
                return false;
            }
          
        }
        Arrays.sort(freqOne);
        Arrays.sort(freqTwo);
        for(int i=0;i<26;i++){
            
                if(freqOne[i]==freqTwo[i])continue;
                else return false;
        }
        return true;
        
    }
}