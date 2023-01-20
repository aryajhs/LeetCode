class Solution {
    public int[] shuffle(int[] nums, int n) {
        int num[] = new int[nums.length];
        for(int i=0;i<n;i++)
        { 
            num[2*i] = nums[i];
            num[2*i + 1] = nums[n+i];
            
        }
        
        return num;
    }
}