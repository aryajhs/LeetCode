class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            map.add(nums[i]);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!map.contains(i+1))
            {
                list.add(i+1);
            }
        }
        
        return list;
       
    }
}