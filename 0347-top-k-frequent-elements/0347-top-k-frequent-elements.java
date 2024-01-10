class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0)return new int[]{};
        List<Integer>[] buckets=new ArrayList[nums.length+1];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x:nums){
                hm.put(x,hm.getOrDefault(x,0)+1);
        }
         for(int x:hm.keySet()){
             if(buckets[hm.get(x)]==null){
                    buckets[hm.get(x)]=new ArrayList<>();
             }
                    buckets[hm.get(x)].add(x);
             
         }
        
        int result[]=new int[k];
        int index=0;
        for(int i=buckets.length-1;i>=0&&index<k;i--){
            if(buckets[i]!=null){
                for(int num:buckets[i]){
                      result[index]=num;
                index++;
                }
              
            }
        }
        return result;
    }
}
