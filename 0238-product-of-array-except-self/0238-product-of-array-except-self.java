class Solution {
    public int[] productExceptSelf(int[] nums) {

      int result [] = new int [nums.length];

        int Temp = 1;

        
        for(int i = 0; i < nums.length; i++){

            result[i] = Temp;
            Temp = Temp * nums[i];
        }

        

        Temp = 1;

        for(int i = nums.length -1 ; i >= 0; i--){

            

            result[i] = result[i] * Temp;
            Temp = Temp * nums[i];
        }
        return result;  
    }
}