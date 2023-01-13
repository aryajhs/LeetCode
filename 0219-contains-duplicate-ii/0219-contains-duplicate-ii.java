class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i) <= k)
            {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
        
//      int count=0;
//         for(int i=0; i<nums.length;i++)
//         {
//             for(int j=i+1; j<nums.length;j++)
//             {
//                  if(nums[i]==nums[j] && Math.abs(i-j)<=k)
//             {
//                            count++;

//             } 
//             }
        
           
//         }
//         if(count >= 1)
//         {
//             return true;
//         }
//         else
//         {
//         return false;
//         }
       
    }
}