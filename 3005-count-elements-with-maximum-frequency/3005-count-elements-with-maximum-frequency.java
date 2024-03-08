class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
            
        }
        int maxFreq=0;
        for(var x:hm.values()){
            maxFreq=Math.max(maxFreq,x);
        }
        System.out.println(maxFreq);
        int count=0;
        for(var x:hm.keySet()){
            if(hm.get(x)==maxFreq){
                count+=maxFreq;
            }
        }
        return count;
    }
}