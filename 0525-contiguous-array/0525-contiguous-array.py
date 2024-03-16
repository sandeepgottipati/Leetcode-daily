
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        my_dict={}
        sum=0;
        my_dict[sum]=-1
        res=0;
        
        for i,n in enumerate(nums):
            if n==0:
                sum-=1
            else:
                sum+=1
            if sum in my_dict:
                res=max(i-my_dict[sum],res)
            else:
                my_dict[sum]=i
        return res;