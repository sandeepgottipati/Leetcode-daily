class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res=new ArrayList<>();
        Set<Integer> hs=new HashSet<>();
        for(int x:nums1){
            hs.add(x);
            
        }
        for(int x:nums2){
            if(hs.contains(x)){
                res.add(x);
            }
        }
        return res.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}