class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer> studentQueue=new LinkedList<>();
       Stack<Integer> sandwichStack=new Stack<>();
       for(int i=0;i<students.length;i++){
        sandwichStack.push(sandwiches[sandwiches.length-i-1]);
        studentQueue.offer(students[i]);

       }
       int couldnotServe=0;
       while(true){
            if(studentQueue.peek()==sandwichStack.peek()){
                couldnotServe=0;
                sandwichStack.pop();
                studentQueue.poll();

            }
            else{
                couldnotServe++;
[1,1,0,0]
