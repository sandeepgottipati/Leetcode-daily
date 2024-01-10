class Solution {
    public int longestSubstring(String s, int k) {
        //1 calculate unique_char_frequency of s.
        int uniqueCharCount=getUniqueCharCount(s);
        //intialise frequency array 
        int freqMap[]=new int[26];
        int result=0;
        //slide the window till uniqueCharCount times.
        for(int currUniqueCount=1;currUniqueCount<=uniqueCharCount;currUniqueCount++){
           //initilization of variables .
            int countK=0;
            int countUnique=0;
            int start=0;int end=0;
            Arrays.fill(freqMap,0); // should make freqMap to 0 for every iteration.
            //sliding starts .
            while(end<s.length()){
                //if the count of unique characters less than the current unique count in the for loop.
                //we add the elements to map and keep track of currentunique count and current k count 
                
                if(countUnique<=currUniqueCount){
                    int idx=s.charAt(end)-'a';
                    if(freqMap[idx]==0) countUnique++;
                    freqMap[idx]++;
                    //this would execute only only for every unique character in the window.
                     if(freqMap[idx]==k)countK++;
                    
                    end++;
                }
                else{
                    //shrinking the window size till the uniquecount becomes eequal to currentiteration count.
                    int idx=s.charAt(start)-'a';
                
                    
                    if(freqMap[idx]==k)countK--;
                        freqMap[idx]--;
                        if(freqMap[idx]==0)countUnique--;
                    start++;
                }
                //calculating the result.
                if(countUnique==currUniqueCount && countK==countUnique){
                        result=Math.max(result,end-start);
                    System.out.println(result);
                }
            }
        }
        return result;
    }
    int  getUniqueCharCount(String s){
        boolean []count=new boolean[26];
        int unique_count=0;
        for(int i=0;i<s.length();i++){
            
            if(!count[s.charAt(i)-'a']){
                unique_count++;
            }
            count[s.charAt(i)-'a']=true;
        }
        return unique_count;
        
    }
}
