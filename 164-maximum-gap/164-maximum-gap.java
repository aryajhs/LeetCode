class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]-nums[i-1]);
            
        }
        return max;
    }
}