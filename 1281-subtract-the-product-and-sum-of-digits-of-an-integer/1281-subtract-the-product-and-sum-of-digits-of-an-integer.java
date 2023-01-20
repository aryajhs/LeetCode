class Solution {
    public int subtractProductAndSum(int n) {
      int  m=1;
       int  s=0;
        int d;
        while(n!=0)
        {
            d=n%10;
            m=m*d;
            s=s+d;
            n=n/10;
        }
        return m-s;
    }
}