class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        String [] keys=new String[]{" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        helper(res,keys,0,digits,sb);
        return res;
    }
    void helper(List<String> res,String []keys,int index,String digits,StringBuilder sb){
        
        if(index==digits.length()){
            res.add(sb.toString());
            return;
        }
        String value=keys[digits.charAt(index)-'0'];
        for(char x:value.toCharArray()){
            sb.append(x);
            helper(res,keys,index+1,digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}