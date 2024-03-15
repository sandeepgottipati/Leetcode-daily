public class Solution{
public int[] productExceptSelf(int arr[]){
int prefix[]=new int[arr.length];
prefix[0]=1;
int  prefixVal=1;
for(int i=1;i<arr.length;i++)
{
prefixVal*=arr[i-1];
prefix[i]=prefixVal;
}
int suffixVal=1;
for(int i=arr.length-2;i>=0;i--){
suffixVal*=arr[i+1];
prefix[i]=prefix[i]*suffixVal;
}
return prefix;
}
}

//arrays 
//pointer 
//two pointers
//sliding window
//