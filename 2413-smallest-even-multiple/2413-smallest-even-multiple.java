class Solution {
    public int smallestEvenMultiple(int n) {
        int i;
        for(i=1;i<=n*10;i++)
        {
            if(i%2==0 && i%n==0)
            {
                return i;
            }
        }
        return i;
    }
}