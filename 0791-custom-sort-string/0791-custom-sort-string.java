class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> hm=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char x:s.toCharArray()){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(char x:order.toCharArray()){
            if(hm.containsKey(x)){
                int freq=hm.get(x);
                while(freq>0){
                    sb.append(x);
                    freq--;
                }
                hm.put(x,0);
                
            }
        }
        for(int i=0;i<s.length();i++){
           
                int freq=hm.get(s.charAt(i));
                while(freq>0){
                    sb.append(s.charAt(i));
                    freq--;
                }
                hm.put(s.charAt(i),0);
            
            
        }
        return sb.toString();
        
    }
}