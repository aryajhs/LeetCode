class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int nums : nums1)
        {
            set.add(nums);
            
        }
        
        for(int nums : nums2)
        {
            if(set.contains(nums))
            {
                set1.add(nums);
            }
        }
        
        int[] num3 = new int[set1.size()];
        int i=0;
        for(int item:set1)
        {
            num3[i]=item;
            i++;
            
        }
     
 
        return num3;
        
    }
}