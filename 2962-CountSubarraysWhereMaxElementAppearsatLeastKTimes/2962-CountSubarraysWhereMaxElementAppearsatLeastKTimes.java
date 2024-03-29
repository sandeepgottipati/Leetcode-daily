       int count=0;
       
       while(right<nums.length){
            if(nums[right]==maxNum){
                count++;
            }
            while(count>=k && left<=right){
                if(nums[left]==maxNum){
                    count--;

                }
                left++;
                result+=nums.length-right;
            }
            right++;
       }
       return result;
    }
}
[1,3,2,3,3]
