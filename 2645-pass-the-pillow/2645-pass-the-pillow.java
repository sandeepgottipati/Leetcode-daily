class Solution {
    public int passThePillow(int n, int time) {
        int line=1;
        boolean flag=true;
        while(time>0){
            if(flag){
                line++;
                if(line==n)flag=!flag;
            }
            else{
                line--;
                if(line==1)flag=!flag;
            }
            time--;
        }
        return line;
    }
}