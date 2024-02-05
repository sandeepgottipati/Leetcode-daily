class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums.length==0)return list;
        Arrays.sort(nums);
        helper(list,new ArrayList<>(),0,nums);
        return list;
    }
    private void helper(List<List<Integer>> list,List<Integer> currlist,int index,int[] arr){
        list.add(new ArrayList<>(currlist));
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])continue;
            currlist.add(arr[i]);
            helper(list,currlist,i+1,arr);
            currlist.remove(currlist.size()-1);
        }
    }
}