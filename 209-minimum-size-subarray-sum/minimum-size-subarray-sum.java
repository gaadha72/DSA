class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minsum=nums.length+1;


        for(int right = 0;right<nums.length;right++)
        {
            sum+=nums[right];
        
        while(sum>=target)
        {
            minsum=Math.min(minsum,right-left+1);

            sum-=nums[left];
            left++;

            
        }        

        }
        if (minsum==nums.length+1){
            return 0;
        }
        else{
            return minsum;
        }
  
        
    }

}