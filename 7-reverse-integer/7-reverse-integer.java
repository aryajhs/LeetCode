class Solution {
    public int reverse(int x) {
        long d;
        long rev=0;
    
        boolean isNegative = x < 0 ? true : false;
        if(isNegative){
            x = x * -1;
        }
      
        while(x>0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE)
        {
            return 0;
        }
        
        
        return (int) (isNegative == true? rev*-1 : rev);
        
    }
}