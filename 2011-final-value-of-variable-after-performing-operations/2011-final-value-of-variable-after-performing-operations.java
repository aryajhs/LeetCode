class Solution {
    public int finalValueAfterOperations(String[] o) {
        int x=0;
        for(int i=0; i<o.length;i++)
        {
            if(o[i].charAt(1)=='-')
            {
                x=x-1;
            }
            else
            {
                x++;
            }
        }
        return x;
        
    }
}