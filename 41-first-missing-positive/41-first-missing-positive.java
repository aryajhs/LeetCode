class Solution {
     
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
            
        }
        int i;
        for(i=1; i<=nums.length;++i)
        
        if(!set.contains(i))
        {
            return i;
            
        }
       
       
        return i;
    }
}