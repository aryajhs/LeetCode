class Solution {
     int max=0, k=0, i=0;
    public int lengthOfLongestSubstring(String s) {
       
        HashSet<Character> set = new HashSet<>();
        
        while(i<s.length())
        {
            if(!set.add(s.charAt(i)))
            {
                
                set.remove(s.charAt(k++));
            }
            else
            {
                max=Math.max(i-k+1,max);
                i++;
                
            }
        }
        
        return max;
    }
}