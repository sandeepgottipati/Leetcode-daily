class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        
        for(var x:hm.keySet()){
            if(set.contains(hm.get(x))){
                return false;
            }
            set.add(hm.get(x));
        }
        return true;
    }
}