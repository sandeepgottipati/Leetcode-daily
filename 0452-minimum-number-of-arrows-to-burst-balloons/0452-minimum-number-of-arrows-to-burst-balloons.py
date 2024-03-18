class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        points.sort(key=lambda x:x[0])
        res=[]
        for x in points:
            curr_index=len(res)
            if(len(res)==0):
                res.append(x)
                
            elif(res[curr_index-1][1]>=x[0]):
                res[curr_index-1][1]=min(res[curr_index-1][1],x[1])
                
            else:
                res.append(x)
        return len(res)
        