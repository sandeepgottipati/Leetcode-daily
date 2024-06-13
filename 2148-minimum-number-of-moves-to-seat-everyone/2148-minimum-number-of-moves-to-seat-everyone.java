class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        if(seats.length!=students.length){return -1;}
       Arrays.sort(seats);
       Arrays.sort(students);
       int res=0;
       for(int i=0;i<seats.length;i++){
            res+=Math.abs(seats[i]-students[i]);
       }
       return res;
    }
}