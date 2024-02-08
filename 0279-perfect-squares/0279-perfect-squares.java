class Solution {
    public int numSquares(int n) {
        if(n<=0)return 0;
        //int memo[]=new int[n+1];
        // Arrays.fill(memo,-1);
        // return helper(n,Integer.MAX_VALUE,memo)-1;
        int dp[]=new int[n+1];
        Arrays.fill(dp,n+1);
       dp[0]=0;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j*j<=n;j++){
                int square=j*j;
                if(i>=square){
                    dp[i]=Math.min(dp[i-square]+1,dp[i]);
                }
                
            }
        }
return dp[n];

    }
    int helper(int n,int min,int [] memo){
            if(n==0 ) return 1;
            if(memo[n]!=-1)return memo[n];
            for(int i=1;i*i<=n;i++){
                int temp=i*i;
                int ans=helper(n-temp,min,memo)+1;
                min=Math.min(min,ans);
            }
            return memo[n]= min;
    }
}