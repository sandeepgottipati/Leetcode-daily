class Solution {
    class Node implements Comparable<Node>{
         char c;
        int freq;
        
        Node(char c,int freq){
            this.c=c;
            this.freq=freq;
        }
        public int compareTo(Node other){
            return other.freq-this.freq;
        }
        public String toString(){
            return this.c+" "+this.freq;
        }

    }
    public String frequencySort(String s) {
        
        Map<Character,Node> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            if(hm.containsKey(c)){
                hm.get(c).freq+=1;
            }
            else{
                hm.put(c,new Node(c,1));
            }
        }
        List<Node> nodelist=new ArrayList<>();
        for(var values:hm.values()){
           nodelist.add(values);
        }
       Collections.sort(nodelist);
        StringBuilder sb=new StringBuilder();
        for(var x:nodelist){
            sb.repeat(x.c,x.freq);
            
        }
        return sb.toString();
    }
}