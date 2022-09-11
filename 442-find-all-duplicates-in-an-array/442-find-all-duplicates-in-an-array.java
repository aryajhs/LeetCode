class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
    for(int i=0;i<nums.length;i++){          
        int val = Math.abs(nums[i])-1;    // -1 because the range is from 1 to N -> to reach index 0 we have to sub 1 
        if(nums[val]<0){
            list.add(val+1);  // visiting it for the second time
        }
        else{
            nums[val] = -1*nums[val]; // visiting it for the first time
        }
    }
    return list;
}
}