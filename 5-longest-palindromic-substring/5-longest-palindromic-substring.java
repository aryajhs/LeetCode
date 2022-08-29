 
class Solution {
    
    public String longestPalindrome(String s) {
        String res="";
        
        for(int i=0;i<s.length();i++){
            
            String s1 = palindrome(s, i, i);     // for odd length of substring.
            String s2 = palindrome(s, i, i + 1);   // for even length of substring.
            
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
            
        }
        
        return res;
    }
    public String palindrome(String str, int l, int r){
        
        while((l >= 0 && r < str.length()) && (str.charAt(l) == str.charAt(r))){
            
            l--;
            r++;
            
        }
        return (str.substring(l + 1, r));
    }
}