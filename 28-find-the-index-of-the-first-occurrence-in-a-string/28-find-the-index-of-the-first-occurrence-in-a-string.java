class Solution {
    public int strStr(String haystack, String needle) {
        
        StringBuilder sb = new StringBuilder(haystack);
        
        int index = sb.indexOf(needle);
       
        return index;
    }
}