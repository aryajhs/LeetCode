class Solution {
    public int romanToInt(String s) {
        int n=s.length(),pc,pn,ans=0;
        s+=s.charAt(n-1);
        for(int i=0;i<n;i++)
        {
            pc=prioty(s.charAt(i));
            pn=prioty(s.charAt(i+1));
            if(pc>=pn)
                ans+=pc;
            else
            {
                ans+=pn-pc;
                i++;
            }
        }
        return ans;
    }
    static int prioty(char ch)
    {
        switch(ch)
        {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        return 0;
    }
}