class Solution {
    public int climbStairs(int n) { 
        int fib[]=new int[n+1];
        if(n==1)return 1;
        if(n==2) return 2;

        fib[1]=1;
        fib[2]=2;
        for(int i=3;i<fib.length;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
        //return ways(n);
    }
    // private int ways(int n){
    //     if(n==0)return 1;
    //     if(n<0)return -1;
    //     int one=ways(n-1);
    //     int two=ways(n-2);
    //     if(one==-1){
    //         return two;
    //     }
    //     if(two==-1){
    //         return one;
    //     }
    //     return one+two;
    // }
}