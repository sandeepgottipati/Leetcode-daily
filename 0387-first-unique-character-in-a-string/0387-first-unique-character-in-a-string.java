class Solution {
    public int firstUniqChar(String s) {
  int arr[]=new int[26];
  for(int i=0;i<s.length();i++){
      int currIndex=s.charAt(i)-'a';
      arr[currIndex]+=1;
  }
  char res='a';
  int minIndex=Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++){
      if(arr[i]==1){
            res=(char) (i+'a');
            minIndex=Math.min(s.indexOf(res),minIndex);
      }
      
  }
  return minIndex==Integer.MAX_VALUE?-1:minIndex;
}
}