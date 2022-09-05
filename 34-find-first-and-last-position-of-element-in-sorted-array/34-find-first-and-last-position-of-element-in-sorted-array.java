class Solution {
  public int[] searchRange(int[] nums, int target) 
{
    int[] a = {-1,-1};
    int n=nums.length;
    if(n==0) return a;
	
    int s=1, e=n-1, mid=0;
    if(nums[0]==target) a[0]=0;
    
    while(s<=e)
    {
        mid=s+(e-s)/2;
        if(nums[mid]==target && nums[mid-1]<target) 
        {
            a[0]=mid;
            break;
        }
        if(nums[mid]>target || nums[mid]==target && nums[mid-1]==target) e=mid-1;
        else s=mid+1;
    }
    
    if(nums[n-1]==target) 
    {
        a[1]=n-1;
        return a;
    }
    
    s=0; 
    e=n-2; 
    mid=0;
    while(s<=e)
    {
        mid=s+(e-s)/2;
        if(nums[mid]==target && nums[mid+1]>target) 
        {
            a[1]=mid;
            break;
        }
        if(nums[mid]<target || nums[mid]==target && nums[mid+1]==target) s=mid+1;
        else e=mid-1;
    }
    return a;
}
}