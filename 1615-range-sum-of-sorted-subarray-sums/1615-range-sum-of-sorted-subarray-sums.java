class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> arrList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
  arrList.add(sum);
            }
          
        }
        
        Collections.sort(arrList);
        System.out.println(arrList);
        int res=0;
        for(int i=left-1;i<right && i<arrList.size();i++){
          res+=arrList.get(i);
          res=res%1000000007;

        }
        return res;
    }
}