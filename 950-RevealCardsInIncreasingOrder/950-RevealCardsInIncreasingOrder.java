class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck==null || deck.length==1){
            return deck;
        }
        int n=deck.length;
       Arrays.sort(deck);
       int []res=new int[n];
       Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++)queue.add(i);
        for(int i=0;i<n;i++){
            res[queue.poll()]=deck[i];
            queue.offer(queue.poll());
        }
        return res;
    }
}
[17,13,11,2,3,5,7]
