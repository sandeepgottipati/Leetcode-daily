public class Solution {
    public int MinimumRecolors(string blocks, int k) {
        if(blocks.Length < k){
            return -1;
        }
        int blackCount=0;
        int ans=int.MaxValue;
        for(int i=0;i<blocks.Length;i++){
            if(i-k>=0 && blocks[i-k]=='B')blackCount--;
            if(blocks[i]=='B')blackCount++;
            ans=Math.Min(ans,k-blackCount);

        }
        return ans;

    }
}