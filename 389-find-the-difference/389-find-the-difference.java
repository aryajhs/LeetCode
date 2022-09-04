class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0)
        {
            return t.charAt(0);
        }
        
        char[] c1 =s.toCharArray();
        char[] c2 =t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int p1 = 0;
        int p2 = 0;
        while(p1<c1.length && p2<c2.length)
        {
            if(c1[p1]!=c2[p2])
            {
                return c2[p2];
            }
            p1++;
            p2++;
        }
        
        return c2[c2.length-1];
        
        
    }
}