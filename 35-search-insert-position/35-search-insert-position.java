class Solution {
     int i;
     int j;
        
    public int searchInsert(int[] nums, int target) {
       
        for(i=0;i<=nums.length-1;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else
            {
                for(j=nums.length-1;j>=0;j--)
                {
                    if(target>nums[j])
                    {
                        return j+1;
                    }
                }
            }
        }
        return (j+1);
        
    }
}