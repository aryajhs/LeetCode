class Solution {
    public boolean isUgly(int n) {
        if(n==0) return false;
        
        int count=0;
        while(n!=1 && count==0)
        {
           if(n%2==0)
            {
                n=n/2;
            }
            else if(n%3==0)
            {
                n=n/3;
            }
            else if(n%5==0)
            {
                n=n/5;
            }
            
        
        else
        {
            count=1;
        }
    }
        
        return (count == 0 ? true : false);
        
    }
}