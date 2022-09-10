class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> list= new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            
            else if(nums1[i]<nums2[j])
            {
                i++;
            
            }
            else
            {
                j++;

            }
        }
            i=0;
            
            int[] ans= new int[list.size()];
            for(int l:list)
            {
                ans[i]=l;
                i++;
            }
        return ans;
    }
}