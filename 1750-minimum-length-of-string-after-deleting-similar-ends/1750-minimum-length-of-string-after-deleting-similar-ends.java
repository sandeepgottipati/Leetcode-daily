class Solution {
    public int minimumLength(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                while(s.charAt(start)==s.charAt(start+1) && start+1<end){
                    start++;
                }
                  while(s.charAt(end)==s.charAt(end-1) && start<end-1){
                    end--;
                }
                start++;
                end--;
            }
            else{
                break;
            }
        }
        int ans=end-start+1;
        return ans<0?0:ans;
    }
}