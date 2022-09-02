class Solution {
    public void moveZeroes(int[] nums) {
        int count =0;
        
        for(int i=0; i<=nums.length-1;i++)
        {
            if(nums[i]!=0)
            {
                nums[count]=nums[i];
              count++;
            
            }
        }
        for(int i=count;i<=nums.length-1;i++)
        {
            nums[i]=0;
            
        }
            
        
        
    }
}