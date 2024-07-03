class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       int[] map=new int[1001];

        List<Integer>res=new ArrayList<>();
   
   
        for(int num:nums2){
            map[num]++;
        }
        for(int i=0;i<nums1.length;i++){
           if(map[nums1[i]]>0){
            res.add(nums1[i]);
            map[nums1[i]]--;
           }
            
        }

        return res.stream().mapToInt(i->i).toArray();
    }
}