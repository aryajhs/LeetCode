class Solution {
    public String reverseWords(String s) {
          s=s + " ";
        
        StringBuilder sb = new StringBuilder(s);
        
         sb.reverse();
        
        
        
        String ss=" ";
      
        int j = sb.length()-1;
        for(int i = sb.length()-1;i>=0;i--)
        {
            if(sb.charAt(i)==' ')
            {
                ss+=sb.substring(i+1,j+1) + " ";
                j=i-1;
                
            }
        }
        
        return ss.trim();
        
    }
}