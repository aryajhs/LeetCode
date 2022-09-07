class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
          
                if(nums[i]==nums[i+1])
                {
                    count++;
                }
            
        }
        if(count>=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}