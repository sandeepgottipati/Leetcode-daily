class Solution {
    public String convert(String s, int numRows) {
        int increment=2*(numRows-1);
        char[] res=new char[s.length()];
        if(numRows==1)return s;
        int len=s.length();
        int k=0;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<len;j=j+increment){
                res[k++]=s.charAt(j);
                if(i>0 && i<numRows-1 && j+increment-2*i<len){
                        res[k++]=s.charAt(j+increment-2*i);
                }
            }
        }
        return new String(res);
    }
}