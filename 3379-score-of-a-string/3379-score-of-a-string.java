class Solution {
    public int scoreOfString(String s) {
        System.out.println((int)s.charAt(0));
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int num1=(int)s.charAt(i);
            int num2=(int)s.charAt(i+1);
            sum+=Math.abs(num1-num2);
        }
        return sum;
    }
}