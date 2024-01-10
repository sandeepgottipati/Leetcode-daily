class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqOne=new int[26];
           int[] freqTwo=new int[26];

        if(s2.length()<s1.length())return false;
        
        for(int i=0;i<s1.length();i++){
            freqOne[s1.charAt(i)-'a']++;
       
        }

        int k=s1.length();
        for(int i=0;i<k;i++){
             freqTwo[s2.charAt(i)-'a']++;
           
        }
    
        for(int j=k;j<s2.length();j++){
            if(checkValid(freqTwo,freqOne)){
                return true;
            }
              freqTwo[s2.charAt(j)-'a']++;
            freqTwo[s2.charAt(j-k)-'a']--;
          
        }
         if(checkValid(freqTwo,freqOne)){
                return true;
            }
        
        return false;
    }
    boolean checkValid(int []arr1,int[]arr2){
            for(int i=0;i<26;i++){
                if(arr2[i]!=arr1[i]){
                    return false;
                }
            }
        return true;
    }
}