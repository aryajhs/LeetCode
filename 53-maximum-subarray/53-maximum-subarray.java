class Solution {
    public int maxSubArray(int[] nums) {
        int s1=Integer.MIN_VALUE,s2=0;
        for(int i=0;i<nums.length;i++){
            s2+=nums[i];
            if(s1<s2)
                s1=s2;
            if(s2<0)
                s2=0;
        }
        return s1;
    }
}