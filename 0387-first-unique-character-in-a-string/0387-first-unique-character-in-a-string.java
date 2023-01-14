class Solution {
    public int firstUniqChar(String s) {
        boolean count=false;
        for(int i=0; i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    count = true;break;
                }
            }
            if(count==false)
                {return i;}
            else
                {count = false;} 
        }
        return -1;
        
    }
}