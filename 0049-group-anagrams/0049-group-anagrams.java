class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        String[] sortedStrs=Arrays.stream(strs).map(s->sortString(s)).toArray(String[]::new);    
        for(int i=0;i<strs.length;i++){
            if(map.containsKey(sortedStrs[i])){
                map.get(sortedStrs[i]).add(strs[i]);
            }
            else{
                map.put(sortedStrs[i],new ArrayList<>());
                map.get(sortedStrs[i]).add(strs[i]);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(var x: map.values()){
                res.add(x);
        }
        return res;

    }
       public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Sort the characters
        return new String(chars); // Convert the sorted characters back to a string
    }
}

