class Solution {
    public boolean isPowerOfTwo(int n) {
    //    for(int i=0;i<31;i++){
    //         if(n==Math.pow(2,i)){
    //             return true;
    //         }
    //    }
    //    return false;
    if(n==0 || n==-2147483648){
        return false;
    }
    if((n&(n-1))==0){
        return true;
    }
    return false;
    }
}